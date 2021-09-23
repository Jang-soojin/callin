package callinedu.callin.interceptor;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class MenuInterceptor implements HandlerInterceptor{
	
	
	private static final Logger log = LoggerFactory.getLogger(MenuInterceptor.class);
	

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String moduleName = null;
		String url = request.getRequestURI();
		
		//예제
		//url = "/admin/member/memberList";
		
		if(url.indexOf("/admin") > -1) {
			url = url.replace("/admin/", "");
		}		
		
		if(url.indexOf("/") > -1) {			
			moduleName = url.substring(0, url.indexOf("/"));
		}
		
		log.info("module name - {}", moduleName);
		System.out.println("moduleName -> " + moduleName);
		System.out.println("url -> " + url);
				
		request.setAttribute("sideMenu", moduleName);
		
		return true;
		
	}

}