package org.springframework.web.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

/**
 * @Author: admin
 * @Description:
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.web.demo
 * @CreateTime: 2021-04-17 15:45:04
 */
@Configuration
@ComponentScan(basePackages = {"org.springframework.web.demo"}, includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {RestController.class, Controller.class})
}, useDefaultFilters = false)
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {

	/**
	 * 配置拦截器
	 * @return
	 */
	@Bean
	public ArtistInterceptor artistInterceptor() {
		return new ArtistInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(artistInterceptor()).addPathPatterns("/*");
	}

	/**
	 * 配置文件上传下载的组件
	 * @return
	 */
	@Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setDefaultEncoding("UTF-8");
		resolver.setMaxUploadSize(1024 * 1024 * 10);
		return resolver;
	}

	/**
	 * 注册处理国际化资源的组件
	 * @return
	 */
	@Bean
	public AcceptHeaderLocaleResolver localeResolver() {
		AcceptHeaderLocaleResolver resolver = new AcceptHeaderLocaleResolver();
		return resolver;
	}

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setSuffix(".jsp");
		viewResolver.setPrefix("/WEB-INF/jsp/");
		return viewResolver;
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(new MappingJackson2HttpMessageConverter());
	}
}
