package com.example.demo;

import com.example.demo.config.RedisClientTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/redis")
public class Controller {
    @Autowired
    private RedisClientTemplate redisClientTemplate;

    @GetMapping(value = "/")
    public Object testSet(){
        redisClientTemplate.setToRedis("test", "humin he liuliu");
        System.out.println(redisClientTemplate.getRedis("test"));
        return "OK";
    }

}
