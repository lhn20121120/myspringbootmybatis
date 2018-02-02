package com.lk.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan(basePackages = "com.lk.lambda.mapper")
@SpringBootApplication
public class MyspringbootmybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringbootmybatisApplication.class, args);
	}
}


