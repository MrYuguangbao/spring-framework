package org.springframework.demo.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: admin
 * @Description: bean生命周期主函数
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo.lifecycle
 * @CreateTime: 2021-05-03 16:38:41
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		IUserService userService = (IUserService) ac.getBean("userService");
		userService.test();
	}


}
