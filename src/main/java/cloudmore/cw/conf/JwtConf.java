package cloudmore.cw.conf;

import org.springframework.boot.context.properties.*;
import org.springframework.context.annotation.*;
import lombok.*;

@Data
@Configuration
@ConfigurationProperties(prefix="jwt")
public class JwtConf{
	private String issuer;
	private String audience;
	private String subject;
	private String type;
	private int validMinutes;
	private int notBefore; // MinutesInThePast
	private String kid;
	private String secret;
	private String audioEp;
	private String videoEp;

	@Bean
	public JwtConf jwtConf(){
		return this;
	}
}
