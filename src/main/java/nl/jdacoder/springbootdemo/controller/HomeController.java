package nl.jdacoder.springbootdemo.controller;

import lombok.RequiredArgsConstructor;
import nl.jdacoder.springbootdemo.model.User;
import nl.jdacoder.springbootdemo.service.HomeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor

public class HomeController implements HomeAPI{
    private final HomeService homeService;

    @RequestMapping("/")
    public String home(){
        return homeService.getHello();
    }

    @GetMapping("/user")
    public User createUser(){
        User user = new User();
        user.setId("1");
        user.setName("Jordy");
        user.setEmailId("info@jdacoder.nl");
        return user;
    }
    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id,
                               @PathVariable("id2") String name){
        return "The path Variable:" + id + ":" + name;
    }

    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name,
                                @RequestParam(name = "email", required = false, defaultValue = "") String emailId){
        return "Your name is:" + name + "and EmailId:" + emailId;
    }

}
