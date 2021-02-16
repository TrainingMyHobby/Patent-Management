package patentapp.api.common.config.casemgmt;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "patentapp.api.common.config.casemgmt", "patentapp.api.common.config.common",
		"patentapp.api.casemgmt.services", "patentapp.common.controller.crud.casemgmt",
		"patentapp.common.services.crud.casemgmt", "patentapp.common.dao.crud.casemgmt" })
@EntityScan(basePackages = { "patentapp.common.model.casemgmt", "patentapp.common.model.common" })
@EnableJpaRepositories(basePackages = { "patentapp.api.casemgmt.dao", "patentapp.common.dao.common" })
@EnableTransactionManagement
public class CaseMgmtConfig {

}
