package nl.jdacoder.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController implements HomeAPI{

    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }

}
