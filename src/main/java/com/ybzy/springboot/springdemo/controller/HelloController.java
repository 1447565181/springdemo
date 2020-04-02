package com.ybzy.springboot.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public  String hello(){
        return "hello spring boot";
    }

    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest req){
        SimpleDateFormat sdf = new SimpleDateFormat("yyy/mm/dd/");
        String realPath=req.getSession().getServletContext().getRealPath("/uploadFile");
        String format =  sdf.format(new Date());
        File folder = new File(realPath + format);
        return "0";
    }
}
