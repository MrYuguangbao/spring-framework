package org.springframework.demo.lifecycle;

import org.springframework.stereotype.Component;

/**
 * @Author: admin
 * @Description: 测试类2
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo.lifecycle
 * @CreateTime: 2021-05-03 16:39:27
 */
//@Component
public class User {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
