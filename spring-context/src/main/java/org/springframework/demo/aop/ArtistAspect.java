package org.springframework.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.time.LocalDateTime;

/**
 * @Author: admin
 * @Description: @Aspect（AspectJ框架中的注解）切面类:给业务方法增加功能的类，里面的方法是用来具体增强的
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo
 * @CreateTime: 2021-04-16 14:52:16
 */
@Aspect
public class ArtistAspect {

	/**
	 * 方法定义的规则：公共方法、无返回值，方法名自定义，参数可有可无（如果有，需要按指定类型加，不能自定义！！！）
	 * 参数JointPoint可以获取方法执行时的信息，如：方法名称，参数等等
	 */
	@Before(value = "execution(* *..HelloServiceImpl.do*(..))")
	public void myBefore(JoinPoint jp) {
		System.out.println("被代理的方法签名："+jp.getSignature());
		Object[] args = jp.getArgs();
		System.out.print("参数：");
		for (Object arg : args) {
			System.out.print(arg + ", ");
		}
		System.out.println("\n--前置通知1--");
	}

	@AfterReturning(value = "execution(* *..HelloServiceImpl.do*(..))", returning = "res")
	public void myAfterReturning(Object res) {
		res = "aop修改";
		System.out.println("--后置通知--，返回结果：" + res);
	}

}
