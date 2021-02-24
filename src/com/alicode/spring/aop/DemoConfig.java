package com.alicode.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {
		"com.alicode.spring.aop",
		"com.alicode.spring.dao",
		"com.alicode.spring.aspect"})
public class DemoConfig {

}
