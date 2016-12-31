package com.stan

import java.security.Principal

import javax.servlet.http.HttpServletRequest

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = '/products')
@EnableResourceServer
class CatalogController {
	
	@RequestMapping(method = RequestMethod.GET)
	String getProperty(HttpServletRequest request, Principal principal){
		Enumeration e = request.getHeaderNames()
		while(e.hasMoreElements()){
			def s = e.nextElement()
			println s
		}
		return principal == null ? "Hello anonymous" : "Hello " + principal.getName();
	}
}