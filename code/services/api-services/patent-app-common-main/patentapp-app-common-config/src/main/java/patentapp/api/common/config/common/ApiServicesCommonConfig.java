package patentapp.api.common.config.common;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "patentapp.common.utils", "patentapp.common.controller.crud.config",
		"patentapp.api.common.config.common", })
@EntityScan(basePackages = { "patentapp.common.model.common" })
@EnableTransactionManagement
public class ApiServicesCommonConfig {

}
