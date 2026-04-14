package com.karina.app.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration//설정파일입니다 객체생성하세요 라고 스프링에게 알려줌
public class FileMappingConfig implements WebMvcConfigurer{
	
	//프로퍼티스에 있는 데이터를 자바로 가져오는법
	@Value("${app.upload.url}")
	private String url;
	
	@Value("${app.upload.path}")
	private String path;
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		//메서드를 연결해서 호출하는 방식 메서드체이닝
		registry.addResourceHandler(url) //    /files/**
		.addResourceLocations(path)		// 		file:\\C:\\upload\\
		;
		
		
		
	}

}
