package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
기본적으로 우리가 만드는 서비스라는 개념은 반드시 두 가지 개념이 존재함
서버(Server)와 고객(Client) [ 공급자와 수요자 ]
우리가 구동시킨 Spring Boot 서버 (Server)는 말 그대로 Server에 해당함
우리가 만든 Controller에 URL을 요청하는 모든 사용자들
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
