package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulProxy

public class ZuulProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulProxyApplication.class, args);
	}
}
