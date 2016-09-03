package com.whiteelephant.nineplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gordon on 16/9/3.
 */
@Controller
@RequestMapping("/")
public class PostController {

    @ResponseBody
    @RequestMapping("/index")
    public String hello() {
        return "hello world";
    }
}
