package com.example.springbootControllerAdvice;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhixiao.mzx
 * @date 2019/10/8
 */
@Data
@Builder
public class HttpResult<T> {
    private Integer code;
    private String msg;
    private T data;
}
