package com.example.Profiels;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
public class DbCon {

	@Value("${my.driver}")
	private String driver;

	@Value("${my.url}")
	private String url;
  
	private String pass;

}
