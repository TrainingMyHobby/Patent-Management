package patentapp.api.audvid.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import patentapp.common.api.services.util.AppInitiUtil;

@SpringBootApplication
public class ApiAudVidApp {

	private static final String[] profiles = { "api-audvid" };

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(ApiAudVidApp.class);
		app.setAdditionalProfiles(AppInitiUtil.buildApiServicesAddlProfiles(profiles));
		
		app.run(args);

	}

}
