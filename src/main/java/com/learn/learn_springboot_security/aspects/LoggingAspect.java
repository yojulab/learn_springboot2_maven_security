package com.learn.learn_springboot_security.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect	
@Component
public class LoggingAspect {
private Logger logger = Logger.getLogger(getClass().getName());
@Before(value="execution(* com.clustering.project.controller.*Controller.*(..))")
public void logBefore(JoinPoint joinPoint){
logger.info("Entering " + joinPoint.getTarget().getClass().getSimpleName() 
+"'s"+ joinPoint.getSignature().getName());
Object[] args = joinPoint.getArgs();
for(int i=0; i<args.length; i++){
logger.info("LoggingAspect args["+ i +"] --> "+ args[i]);		}
}
}
