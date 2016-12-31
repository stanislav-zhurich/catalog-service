package com.stan

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
@RefreshScope
class CatalogApplication{

	static void main(String[] args) {
		SpringApplication.run CatalogApplication, args
	}
	
	/*@Override
	public void configure(HttpSecurity http) throws Exception {
		
				
				http
				.antMatcher("/**")
				.authorizeRequests()
				  .antMatchers("/**")
				  .permitAll()
				
	}*/
}
