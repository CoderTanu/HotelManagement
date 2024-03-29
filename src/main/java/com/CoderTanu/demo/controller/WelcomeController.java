package com.CoderTanu.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.micrometer.common.util.StringUtils;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

	@GetMapping(produces =MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	public String getGreeting(@RequestParam(value="name", required=false) String name) {
		
		String greeting= "Hello";
		if(StringUtils.isNotEmpty(name)) {
			greeting =greeting+name;
		}else {
			greeting=greeting + " world";
		}
		
		return "<h1>" + greeting + "</h1>";
	}
}
