package patentapp.api.audvid.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiAudVidApp {
	
	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(ApiAudVidApp.class);
		app.run(args);

	}

}
