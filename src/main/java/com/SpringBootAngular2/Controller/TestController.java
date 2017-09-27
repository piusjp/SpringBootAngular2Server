package com.SpringBootAngular2.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/api/hello")
	private String greet() {
		return "hallo, and welcome";
	}
}
