package com.stackroute.muzix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("com.stackroute.muzix.repository.TrackRepository")
public class MuzixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuzixApplication.class, args);
	}

}
