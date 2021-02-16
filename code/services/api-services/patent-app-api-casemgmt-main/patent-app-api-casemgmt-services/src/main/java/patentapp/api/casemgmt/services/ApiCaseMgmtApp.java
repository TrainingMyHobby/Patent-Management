package patentapp.api.casemgmt.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import patentapp.common.api.services.util.AppInitiUtil;

@SpringBootApplication
public class ApiCaseMgmtApp {

	private static final String[] profiles = { "api-casemgmt" };

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ApiCaseMgmtApp.class);
		app.setAdditionalProfiles(AppInitiUtil.buildApiServicesAddlProfiles(profiles));

		app.run(args);

	}
}
