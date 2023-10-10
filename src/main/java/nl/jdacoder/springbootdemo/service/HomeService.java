package nl.jdacoder.springbootdemo.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {


    public String getHello() {
        return "Hello World";
    }
}
