package patentapp.api.masterdata.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiMasterDataApp {
	
	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(ApiMasterDataApp.class);
		app.run(args);
		
	}
}
