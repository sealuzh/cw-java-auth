package cloudmore.cw.auth;

import org.jose4j.jws.*;
import org.jose4j.jwt.*;
import org.slf4j.*;
import cloudmore.cw.conf.*;
import cloudmore.cw.dto.*;
import lombok.*;

@Data
public class AuthorizeRes{
	private final Logger log=LoggerFactory.getLogger(this.getClass());
	private AuthorizeResDTO dto;
	
    public JwtConf _jwtConf=ApplicationContextProvider.getApplicationContext().getBean("jwtConf", JwtConf.class);
    public JwtHelper _jwtHelper=ApplicationContextProvider.getApplicationContext().getBean("jwtHelper", JwtHelper.class);


	public AuthorizeRes(AuthorizeReq authReq,JwtHelper jwtHelper,JwtConf jwtConf) throws Exception{
		JwtClaims claims=jwtHelper.getClaims(authReq.getEp());
		JsonWebSignature jwt=jwtHelper.getToken(claims);
		setDto(new AuthorizeResDTO(authReq.getId()){
			{
				setScope(jwtConf.getAudience());
				setGrantType(authReq.getGrantType());
				setExpire(claims.getExpirationTime().getValue());
				setEp(authReq.getEp());
				setToken(jwt.getCompactSerialization());
			}
		});
	}
	
	public AuthorizeRes(AuthorizeReq authReq) throws Exception{
		JwtClaims claims = _jwtHelper.getClaims(authReq.getEp());
		JsonWebSignature jwt = _jwtHelper.getToken(claims);
		setDto(new AuthorizeResDTO(authReq.getId()){
			{
				setScope(_jwtConf.getAudience());
				setGrantType(authReq.getGrantType());
				setExpire(claims.getExpirationTime().getValue());
				setEp(authReq.getEp());
				setToken(jwt.getCompactSerialization());
			}
		});
	}
	
	
}
