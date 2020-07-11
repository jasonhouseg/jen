package com.raymond.jen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/hello", method = {org.springframework.web.bind.annotation.RequestMethod.GET, org.springframework.web.bind.annotation.RequestMethod.POST})
    @ResponseBody
    public String index() {
        return "hello,jen";
    }
}
