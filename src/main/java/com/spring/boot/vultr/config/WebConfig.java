//package com.spring.boot.vultr.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//
//@Configuration
//@EnableWebMvc
//public class WebConfig implements WebMvcConfigurer {
//	
////	@Override
////	public void addCorsMappings(CorsRegistry registry) {
////	        registry.addMapping("/**");
////	    }
//	
//	
////	@Override
////	public void addResourceHandlers(ResourceHandlerRegistry registry) {
////		exposeDirectory("../category-photos", registry);
////	}
////	
////	public void exposeDirectory(String pathPattern, ResourceHandlerRegistry registry) {
////		Path path = Paths.get(pathPattern);
////		String absolutePath = path.toFile().getAbsolutePath();
////		String logicalPath = pathPattern.replace("../", "") + "/**";
////		registry.addResourceHandler(logicalPath)
////		.addResourceLocations("file:" + absolutePath + "/");
////	}
////}
//	
//}
