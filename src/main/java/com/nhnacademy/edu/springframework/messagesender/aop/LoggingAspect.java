package com.nhnacademy.edu.springframework.messagesender.aop;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.ElapsedTimeLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {
    @Around("@annotation(elapsedTimeLog)")
    public Object loggingExecutionTime(ProceedingJoinPoint pjp, ElapsedTimeLog elapsedTimeLog) throws Throwable {
//        long startTime = System.currentTimeMillis();
//        System.out.println("start : " + startTime);
//        Object retVal = pjp.proceed();
//        long endTime = System.currentTimeMillis();
//        System.out.println("end : " + endTime);
//
//        long elapsedTime = endTime - startTime;
//
//        System.out.println("elapsed time : " + elapsedTime + "ms");
//
//        return retVal;

        StopWatch stopWatch = new StopWatch();
        try {
            stopWatch.start(pjp.getSignature().toString());
            Object retVal = pjp.proceed();
            return retVal;
        } catch (Throwable e) {
            e.printStackTrace();
            throw e;
        } finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        }
    }
}
