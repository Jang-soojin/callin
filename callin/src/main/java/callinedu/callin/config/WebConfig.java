package callinedu.callin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import callinedu.callin.interceptor.CommonInterceptor;
import callinedu.callin.interceptor.MenuInterceptor;



@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	private final MenuInterceptor menuInterceptor;
	private final CommonInterceptor commonInterceptor;
	
	public WebConfig(CommonInterceptor commonInterceptor, MenuInterceptor menuInterceptor) {
		this.commonInterceptor = commonInterceptor;
		this.menuInterceptor = menuInterceptor;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(commonInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns("/css/**")
				.excludePathPatterns("/favicon.ico");
		
		registry.addInterceptor(menuInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns("/AdminLTE-master/**")
				.excludePathPatterns("/favicon.ico");


					
		WebMvcConfigurer.super.addInterceptors(registry);
	}

}