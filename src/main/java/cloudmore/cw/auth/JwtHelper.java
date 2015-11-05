package cloudmore.cw.auth;

import java.util.*;
import lombok.*;
import org.jose4j.jwk.*;
import org.jose4j.jws.*;
import org.jose4j.jwt.*;
import org.jose4j.lang.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import cloudmore.cw.conf.*;

@Data
@Service
public class JwtHelper{
	private final Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private JwtConf jwtConf;

	public JwtClaims getClaims(List<String> ep){
		return new JwtClaims(){
			{
				setGeneratedJwtId();
				setIssuedAtToNow();
				setExpirationTimeMinutesInTheFuture(getJwtConf().getValidMinutes());
				setNotBeforeMinutesInThePast(-getJwtConf().getNotBefore());
				setIssuer(getJwtConf().getIssuer());
				setAudience(getJwtConf().getAudience());
				setSubject(getJwtConf().getSubject());
				// setClaim("email","mail@gridheart.com");
				setStringListClaim("ep", ep);
			}
		};
	}

	public JsonWebSignature getToken(JwtClaims claims) throws JoseException{
		return new JsonWebSignature(){
			{
				setKeyIdHeaderValue(getJwtConf().getKid());
				setContentTypeHeaderValue(jwtConf.getType());
				setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA256);
				setKey(((RsaJsonWebKey)JsonWebKey.Factory.newJwk(jwtConf.getSecret())).getPrivateKey());
				setPayload(claims.toJson());
			}
		};
	}
}
