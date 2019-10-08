package com.example.springbootControllerAdvice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhixiao.mzx
 * @date 2019/10/8
 */
@RestController
public class ManController {
    @GetMapping("/")
    public HttpResult<String> home(String str) {
        if (true) {
            throw new RuntimeException("xxx");
        }
        if (null == str) {
            str = "default";
        }
        return HttpResult.<String>builder().data(str).build();
    }
}
