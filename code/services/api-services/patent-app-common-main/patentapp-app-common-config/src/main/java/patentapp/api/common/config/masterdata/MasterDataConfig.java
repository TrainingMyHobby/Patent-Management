package patentapp.api.common.config.masterdata;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import patentapp.api.common.config.common.ApiServicesCommonConfig;

@Configuration
@ComponentScan(basePackages = { "patentapp.api.common.config.masterdata", "patentapp.api.masterdata.services",
		"patentapp.common.controller.crud.masterdata", "patentapp.common.services.crud.masterdata",
		"patentapp.common.dao.crud.masterdata" })
@EntityScan(basePackages = { "patentapp.common.model.masterdata", "patentapp.common.model.common" })
@EnableJpaRepositories(basePackages = { "patentapp.api.masterdata.dao", "patentapp.common.dao.crud.masterdata" })
@Import(ApiServicesCommonConfig.class)
public class MasterDataConfig {

}
