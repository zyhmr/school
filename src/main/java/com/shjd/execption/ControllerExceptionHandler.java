package com.shjd.execption;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

    @ExceptionHandler({RuntimeException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String,Object> whenRunTimeException(RuntimeException e){
        log.error(e.toString());
        log.error(e.getStackTrace()[0].toString());
        System.out.println(e);
        System.out.println(e.getStackTrace()[0]);
        Map<String,Object> result  = new HashMap<>();
        result.put("message",e.getMessage());
        return result;
    }

    @ExceptionHandler(IOException.class)
    @ResponseBody
    public Map<String,Object> whenIOException(IOException ex){
        log.error(ex.toString());
        log.error(ex.getStackTrace()[0].toString());
        System.out.println(ex);
        System.out.println(ex.getStackTrace()[0]);
        System.out.println();
        Map<String,Object> result = new HashMap<>();
        result.put("message",ex.getMessage());
        return result;
    }
}
