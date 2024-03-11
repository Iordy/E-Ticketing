package com.andrei.eticketing;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class controller {

    @RequestMapping("/")
    public String test(@RequestParam(value="param", defaultValue="World") String param){
        return new String("Hello, " + param + "!");
    }
    
    
}
