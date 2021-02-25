package com.alicode.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutsExpressionsAOP {

	@Pointcut("execution(* com.alicode.spring.model.*.*(..))")
	protected void forDaoPackage() {}
	
	@Pointcut("execution(* com.alicode.spring.model.*.get*(..))")
	protected void getter() { }
	
	@Pointcut("execution(* com.alicode.spring.model.*.set*(..))")
	protected void setter() { }
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	protected void forDaoPackageNoGetterSetter() { }
	
}
