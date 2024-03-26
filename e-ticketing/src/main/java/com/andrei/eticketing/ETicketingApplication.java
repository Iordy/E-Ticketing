package com.andrei.eticketing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.andrei.eticketing.entities.PremiumUser;

@SpringBootApplication
public class ETicketingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ETicketingApplication.class, args);
		//let's create a user and add it to the database
		PremiumUser user = new PremiumUser();
		
	}

}
