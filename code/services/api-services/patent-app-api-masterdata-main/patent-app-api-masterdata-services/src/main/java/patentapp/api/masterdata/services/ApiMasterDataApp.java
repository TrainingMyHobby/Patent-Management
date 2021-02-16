package patentapp.api.masterdata.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import patentapp.api.masterdata.services.config.MasterDataConfig;
import patentapp.common.api.services.util.AppInitiUtil;

@SpringBootApplication
@Import(MasterDataConfig.class)
public class ApiMasterDataApp {

	private static final String[] profiles = { "api-masterdata" };

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(ApiMasterDataApp.class);
		app.setAdditionalProfiles(AppInitiUtil.buildApiServicesAddlProfiles(profiles));

		app.run(args);

	}
}
