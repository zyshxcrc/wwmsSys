package com.drug.wwms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@MapperScan("com.drug.wwms.mapper")
public class WwmsApplication {

    @RequestMapping("/")
    @ResponseBody
    public String currentUser(){
        System.out.println("1234");
        return "1234";
    }

    public static void main(String[] args) {
        SpringApplication.run(WwmsApplication.class, args);
    }
}
