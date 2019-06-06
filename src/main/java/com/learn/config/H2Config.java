package com.learn.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2Config {
    /**
     * H2 db를 웹 상에서 보기 위한 Bean
     * @return
     */
    @Bean
	public ServletRegistrationBean<WebServlet> h2servletRegistration() {
		ServletRegistrationBean<WebServlet> registration = new ServletRegistrationBean<WebServlet>(new WebServlet());
		registration.addUrlMappings("/h2/*");
		return registration;
	}
}