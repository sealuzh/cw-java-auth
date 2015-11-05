package cloudmore.cw.conf;

import java.net.*;
import org.springframework.boot.context.properties.*;
import org.springframework.context.annotation.*;
import lombok.*;

@Data
@Configuration
@ConfigurationProperties(prefix="auth")
public class AuthConf{
	private int timeout;
	private boolean isServiceLimited;
	private URI apiUrl;
	private URI payUrl;
	private URI audioUrl;
	private URI videoUrl;

	@Bean
	public AuthConf authConf(){
		return this;
	}
}
