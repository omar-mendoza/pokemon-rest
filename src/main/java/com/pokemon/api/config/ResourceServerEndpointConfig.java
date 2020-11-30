package com.pokemon.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

@Configuration
public class ResourceServerEndpointConfig extends ResourceServerConfigurerAdapter{

	@Override
	public void configure(HttpSecurity http) throws Exception {

		http.requestMatchers().antMatchers("/api/**")  //  Denegamos el acceso a "/privada"
		.and().authorizeRequests()
		.antMatchers("/api/**").access("hasRole('USER')");
	}
	
	@Bean
	public ResourceServerTokenServices tokenService() {
		RemoteTokenServices remoteTokenService = new RemoteTokenServices();
		
		remoteTokenService.setClientId("poke_user");
		remoteTokenService.setClientSecret("password_poke");
		remoteTokenService.setCheckTokenEndpointUrl("http://localhost:8090/oauth/check_token");
		
		return remoteTokenService;
	}

}
