package com.csi.SBBasicEx2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
	
	@GetMapping
    public String sayHello() {
		return "Hello";
	}
	
	@GetMapping("/show")
	public String shownames() {
		return" ANKITA , MADHAVI, BHUMI, DIPALI,RUTUJA,J  ANAVI";
	}

}
