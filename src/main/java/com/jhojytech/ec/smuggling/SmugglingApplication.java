package com.jhojytech.ec.smuggling;

import com.jhojytech.ec.smuggling.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmugglingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmugglingApplication.class, args);
	}

	@Autowired
	@Qualifier("clientServiceImpl")
	private ClientService clientService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
		System.out.println(clientService.createClient());
		System.out.println(clientService.findAll());
	}
}
