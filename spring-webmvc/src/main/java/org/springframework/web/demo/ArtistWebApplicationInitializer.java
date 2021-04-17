package org.springframework.web.demo;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Author: admin
 * @Description: springmvc注解版启动原理
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.web.demo
 * @CreateTime: 2021-04-17 11:33:15
 */
public class ArtistWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


	@Override
	protected Class<?>[] getRootConfigClasses() {
		// ContextLoaderListener上下文
		return new Class<?>[]{RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// DispatcherServlet上下文
		return new Class<?>[]{WebAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
