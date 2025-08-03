package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {



    @RequestMapping("say-hello-jsp")
//    @ResponseBody // sends as it is to browser
    public String sayHello(){
        return "sayHello";
    }

}
