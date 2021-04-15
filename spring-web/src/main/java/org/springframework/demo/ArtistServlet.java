package org.springframework.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: admin
 * @Description: 注解版servlet测试
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo
 * @CreateTime: 2021-04-15 16:50:12
 */
@WebServlet("/myservlet")
public class ArtistServlet extends HttpServlet {


	private static final long serialVersionUID = 8036056609532600823L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("hello servlet!");
	}
}
