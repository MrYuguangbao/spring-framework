package org.springframework.demo.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: admin
 * @Description: 配置类
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo.lifecycle
 * @CreateTime: 2021-05-03 16:38:17
 */
@ComponentScan("org.springframework.demo.lifecycle")
public class Config {

	@Bean
	public User user() {
		return new User();
	}

	@Bean
	public User user1() {
		return new User();
	}

}
