package com.cfts.ids.openlegacy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.auth.OAuth2Definition;

/***
 * Default swagger configuration
 */
@Configuration
public class SwaggerConfig {

	/***
	 * Default bean configuration to support swagger with jersey.
	 * Also define a default test scope for oauth2 testing using swagger.
	 * @return {@link BeanConfig}
	 */
	@Bean
	public BeanConfig beanConfig() {
		BeanConfig beanConfig = new BeanConfig();

		beanConfig.setTitle("Celeriti Deposits API");
		beanConfig.setVersion("0.1");
		beanConfig.setBasePath("/CeleritiDepositsAPI/services");
		beanConfig.setResourcePackage("com.cfts.ids.openlegacy.services.controllers");
		beanConfig.setScan(true);

		OAuth2Definition auth = new OAuth2Definition();
		auth.setTokenUrl("/CeleritiDepositsAPI/oauth/token");
		auth.setFlow("application"); // in swagger UI 'client_credentials' is 'application'
		auth.scope("test", "Test");
		beanConfig.getSwagger().securityDefinition("oauth2", auth);

		SwaggerContextService service = new SwaggerContextService();
		service.initConfig(beanConfig.getSwagger()).initScanner();

		return beanConfig;
	}

}
