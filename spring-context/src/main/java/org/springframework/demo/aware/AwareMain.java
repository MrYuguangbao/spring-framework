package org.springframework.demo.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: admin
 * @Description: aware主函数测试
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo.aware
 * @CreateTime: 2021-05-01 17:57:49
 */
public class AwareMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		AwareImpl awareImpl = (AwareImpl) ac.getBean("awareImpl");
		awareImpl.invokeAware();
	}


}
