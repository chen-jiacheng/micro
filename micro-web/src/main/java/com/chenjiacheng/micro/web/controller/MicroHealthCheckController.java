package com.chenjiacheng.micro.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenjiacheng on 2024/9/11 00:16
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@RequestMapping("/health")
@RestController
public class MicroHealthCheckController {

    @RequestMapping(method = RequestMethod.GET,path = "/check")
    public String check(){
        return "micro: I'm ok.";
    }

}
