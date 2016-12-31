package com.stan

import javax.servlet.http.HttpServletRequest

import org.springframework.beans.factory.annotation.Value
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = '/products')
@EnableResourceServer
class CatalogController {
	
	@RequestMapping(method = RequestMethod.GET)
	String getProperty(HttpServletRequest request){
		println request.getHeaderNames()
		return 'test product'
	}
}