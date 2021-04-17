package org.springframework.web.demo;

import org.aopalliance.intercept.Interceptor;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: admin
 * @Description:
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.web.demo
 * @CreateTime: 2021-04-17 15:50:37
 */
public class ArtistInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		return false;
	}
}
