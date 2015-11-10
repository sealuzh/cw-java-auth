package cloudmore.cw.conf;

public class ResponseObject {

	private JwtConf jwtConf;
	
	private String ipAddress;
	
	private AuthConf authConf;
	
	private long timestamp;

	public JwtConf getJwtConf() {
		return jwtConf;
	}

	public void setJwtConf(JwtConf jwtConf) {
		this.jwtConf = jwtConf;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public AuthConf getAuthConf() {
		return authConf;
	}

	public void setAuthConf(AuthConf authConf) {
		this.authConf = authConf;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
}
