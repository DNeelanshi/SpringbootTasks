package com.stackroute.muzix;

import com.stackroute.muzix.domain.Track;
import com.stackroute.muzix.exception.TrackAlreadyExistsException;
import com.stackroute.muzix.service.TrackService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class MuzixApplication extends SpringBootServletInitializer implements CommandLineRunner {

	private TrackService trackService;

	public MuzixApplication(TrackService trackService) {
		this.trackService = trackService;
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MuzixApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MuzixApplication.class, args);
	}

	@Override
	public void run(String[] args) {
		try {
			trackService.saveTrack(new Track(1, "All of me", "john wick"));
			trackService.saveTrack(new Track(2, "Crazy in love", "50 shades"));
		} catch (TrackAlreadyExistsException e) {
			e.printStackTrace();
		}
	}
}
