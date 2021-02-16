package patentapp.api.common.config.casemgmt;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import patentapp.api.common.config.common.ApiServicesCommonConfig;

@Configuration
@ComponentScan(basePackages = { "patentapp.api.common.config.casemgmt", "patentapp.api.casemgmt.services",
		"patentapp.common.controller.crud.casemgmt", "patentapp.common.services.crud.casemgmt",
		"patentapp.common.dao.crud.casemgmt" })
@EntityScan(basePackages = { "patentapp.common.model.casemgmt", "patentapp.common.model.common" })
@EnableJpaRepositories(basePackages = { "patentapp.api.casemgmt.dao", "patentapp.common.dao.crud.casemgmt" })
@Import(ApiServicesCommonConfig.class)
public class CaseMgmtConfig {

}
