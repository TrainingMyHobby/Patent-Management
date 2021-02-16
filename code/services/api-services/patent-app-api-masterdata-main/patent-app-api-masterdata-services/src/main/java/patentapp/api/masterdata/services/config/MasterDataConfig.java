package patentapp.api.masterdata.services.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = { "patentapp.api.masterdata.services" })
@EntityScan(basePackages = { "patentapp.common.model.masterdata", "patentapp.common.model.common" })
@EnableJpaRepositories(basePackages = { "patentapp.api.masterdata.dao", "patentapp.common.dao.common" })
public class MasterDataConfig {

}
