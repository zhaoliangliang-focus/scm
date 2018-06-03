package com.scm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.scm.mapper")
public class SCMMain {

	public static void main(String[] args) {
		SpringApplication.run(SCMMain.class, args);
	}

}
