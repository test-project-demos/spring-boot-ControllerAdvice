package com.example.springbootControllerAdvice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhixiao.mzx
 * @date 2019/10/8
 */
@Slf4j
@ControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(Exception.class)
    public HttpEntity<HttpResult> exception(HttpServletRequest request, Exception e) {
        log.error("url: {}", request.getRequestURL());
        return new HttpEntity<>(HttpResult.builder().msg("error").code(404).build());
    }

    @ExceptionHandler(RuntimeException.class)
    public HttpEntity<HttpServletResponse> withOriginResult(HttpServletRequest request, HttpServletResponse response,
                                                            RuntimeException e) {
        return new HttpEntity<>(response);
    }
}
