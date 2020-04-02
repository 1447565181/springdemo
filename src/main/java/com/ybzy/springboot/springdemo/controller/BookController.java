package com.ybzy.springboot.springdemo.controller;

import com.ybzy.springboot.springdemo.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @GetMapping("/books")
    public void books(){
        System.out.println("进来了");
        ValueOperations<String, String> opsl = stringRedisTemplate.opsForValue();
       opsl.set("name","三国演义");
        String name=opsl.get("name");
        System.out.println(name);
        ValueOperations ops2 = redisTemplate.opsForValue();
        Books b1 = new Books(1,"曹雪芹","红楼梦");
        ops2.set("b1",b1);
        Books books = (Books) ops2.get("b1");
        System.out.println(books);
    }
}
