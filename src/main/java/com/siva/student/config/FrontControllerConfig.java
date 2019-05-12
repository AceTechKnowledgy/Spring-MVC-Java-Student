package com.siva.student.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//This class is act as a front controller. This is replacement of web.xml
public class FrontControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// Spring Configuration class
		return new Class[] {ApplicationConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// Spring MVC Configuration class
		return new Class[] {WebMVCConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// This Dispatcher Servlet can handle all request
		return new String[] {"/"};
	}
	
}
