package com.tp.demo;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class IndexController{
    @GetMapping("/hello")
    public Map<String,String> index(){
        return Map.of("msg","Hello Devops!");
    }
}