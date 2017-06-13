package com.cri.aspect;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
@Log4j2
public class WebLogAspect
{
    @Pointcut("execution(public * com.cri.controller..*.*(..))")
    public void webloginfo(){}
    ThreadLocal<Long> startTime = new ThreadLocal<>();
    @Before("webloginfo()")
    public void doBefore(JoinPoint joinPoint) throws Throwable
    {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        startTime.set(System.currentTimeMillis());
        // 记录下请求内容
        log.info("URL : " + request.getRequestURL().toString());
        log.info("getParameterMap : "+ request.getParameterMap());
        log.info("HTTP_METHOD : " + request.getMethod());
        log.info("IP : " + request.getRemoteHost());
        log.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));

    }

    @AfterReturning(returning = "ret", pointcut = "webloginfo()")
    public void doAfterReturning(Object ret) throws Throwable
    {
        // 处理完请求，返回内容
       log.info("RESPONSE : " + ret);
       log.info("-----------------------------------SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));
    }

}