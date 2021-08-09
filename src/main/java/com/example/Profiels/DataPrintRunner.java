package com.example.Profiels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataPrintRunner implements CommandLineRunner {
    
	@Autowired
	private DbCon con;
	public void run(String... args) throws Exception {

		System.out.println(con);
	}

}
