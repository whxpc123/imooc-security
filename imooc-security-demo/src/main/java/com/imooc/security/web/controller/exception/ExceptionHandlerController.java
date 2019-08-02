package com.imooc.security.web.controller.exception;

import com.imooc.security.common.ServerResponse;
import com.imooc.security.exception.ParamException;
import com.imooc.security.exception.ValidateCodeException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(ParamException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ServerResponse exception(ParamException ex){

        return ServerResponse.createByErrorMessage(ex.getMessage());

    }

    @ExceptionHandler(ValidateCodeException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ServerResponse exception(ValidateCodeException e){

        return ServerResponse.createByErrorMessage(e.getMessage());

    }
}
