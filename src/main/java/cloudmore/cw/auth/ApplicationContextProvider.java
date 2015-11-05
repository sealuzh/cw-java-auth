package cloudmore.cw.auth;

import org.slf4j.*;
import org.springframework.beans.*;
import org.springframework.context.*;
import org.springframework.stereotype.*;

@Component
public class ApplicationContextProvider implements ApplicationContextAware{
	private final Logger log=LoggerFactory.getLogger(this.getClass());
	
	private static ApplicationContext context;

	public static ApplicationContext getApplicationContext(){
		return context;
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException{
		context=ctx;
	}
}
