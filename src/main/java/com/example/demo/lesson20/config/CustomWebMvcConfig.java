package com.example.demo.lesson20.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CustomWebMvcConfig extends WebMvcConfigurerAdapter{

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.favorParameter(true)    // 是否支持参数化处理请求
				  .parameterName("format") // 参数的名称， 默认为format
				  .defaultContentType(MediaType.APPLICATION_JSON)  // 全局的默认返回类型
				  .mediaType("xml", MediaType.APPLICATION_XML)     // 参数值与对应的类型XML
				  .mediaType("json", MediaType.APPLICATION_JSON);  // 参数值与对应的类型JSON
	}
	
}
