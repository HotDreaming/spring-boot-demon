package com.lxl.spring.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HiController
 * @Description TODO
 * @Date: 2019/2/25 16:00
 * @Author: leixulong5
 **/
@Controller
@SpringBootApplication
@RequestMapping(value="sb")
public class HiController {
    @RequestMapping(value="/hi")
    @ResponseBody
    public String hi(){
        return "hello world!";
    }

    @RequestMapping(value="page")
    public String myPage(){
        return  "index.html";
    }
}
