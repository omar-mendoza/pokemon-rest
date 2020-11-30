package com.pokemon.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

@Configuration
public class ResourceServerEndpointConfig extends ResourceServerConfigurerAdapter{

	@Value("${auth.client}")
	private String client;
	
	@Value("${auth.password}")
	private String password;
	
	@Value("${auth.url}")
	private String url;

	@Override
	public void configure(HttpSecurity http) throws Exception {

		http.requestMatchers().antMatchers("/api/**") 
		.and().authorizeRequests()
		.antMatchers("/api/**").access("hasRole('USER')");
	}
	
	@Bean
	public ResourceServerTokenServices tokenService() {
		RemoteTokenServices remoteTokenService = new RemoteTokenServices();
		
		remoteTokenService.setClientId(client);
		remoteTokenService.setClientSecret(password);
		remoteTokenService.setCheckTokenEndpointUrl(url);
		
		return remoteTokenService;
	}

}
