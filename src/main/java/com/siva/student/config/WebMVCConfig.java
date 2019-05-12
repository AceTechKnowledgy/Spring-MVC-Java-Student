package com.siva.student.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//This class act as the Spring-MVC Configuration. This is replacement of dispatcher-servlet-xml file

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"com.siva.student.controller"})
public class WebMVCConfig implements WebMvcConfigurer {

	//This method is act as the view resolver
	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		// Register resource handler for CSS and JS
		registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/statics/")
		.setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
	}

}
