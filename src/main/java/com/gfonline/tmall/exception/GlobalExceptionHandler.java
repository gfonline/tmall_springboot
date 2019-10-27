package com.gfonline.tmall.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public String defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception{
        e.printStackTrace();
        Class constrainViolationException = Class.forName("org.hibernate.exception.ConstraintViolationException");
        if (null != e.getCause() && constrainViolationException == e.getClass().getClass()){
            return "违反了约束，多半是外键约束";
        }
        return e.getMessage();
    }

}
