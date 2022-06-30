package edu.miu.cs545.springsecurityjwt.aspect;

import edu.miu.cs545.springsecurityjwt.utils.exception.AopIsAwesomeHeaderException;
import lombok.AllArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@AllArgsConstructor
public class AopIsAwesomeAspect {
    @Autowired
    private HttpServletRequest httpServletRequest;

    @Pointcut("within(edu.miu.cs545.springsecurityjwt.service..*)")
    public void serviceLocator(){}

    @Around("serviceLocator()")
    public Object headerChecker(ProceedingJoinPoint pjp)throws Throwable{
        if (httpServletRequest.getHeader("AOP-IS-AWESOME") == null&&httpServletRequest.getMethod().equals("POST")) {
            throw new AopIsAwesomeHeaderException("Header 'AOP-IS-AWESOME' Not Found");
        }
        return pjp.proceed();
    }
}


