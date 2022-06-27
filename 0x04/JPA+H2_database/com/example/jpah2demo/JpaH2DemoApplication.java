package com.example.jpah2demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaH2DemoApplication {

	@Bean
	public ModelMapper medelMapper(){
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setDeepCopyEnabled(true);
		return modelMapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaH2DemoApplication.class, args);
	}

}
