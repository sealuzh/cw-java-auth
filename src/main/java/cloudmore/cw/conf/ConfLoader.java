package cloudmore.cw.conf;

import cloudmore.cw.auth.ApplicationContextProvider;
import cloudmore.cw.auth.JwtHelper;

public class ConfLoader {

	public static JwtConf getJwtConf(){
		try{
			Thread.sleep(500);
		}catch(Exception e){
			
		}
		return ApplicationContextProvider.getApplicationContext().getBean("jwtConf", JwtConf.class);
	}
	
	public static JwtHelper getJwtHelper(){
		try{
			Thread.sleep(500);
		}catch(Exception e){
			
		}
		return ApplicationContextProvider.getApplicationContext().getBean("jwtHelper", JwtHelper.class);
	}
}
