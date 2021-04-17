package org.springframework.web.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @Author: admin
 * @Description: 父容器配置,不扫描Controller注解
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.web.demo
 * @CreateTime: 2021-04-17 15:28:51
 */
@Configuration
@ComponentScan(basePackages = {"org.springframework.web.demo"},excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {RestController.class, Controller.class}),
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = WebAppConfig.class)
})
public class RootConfig {


}
