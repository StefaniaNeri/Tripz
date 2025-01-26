package com.viaggiTemplate.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViaggiMvc {
	
	@GetMapping("home")
	public String home() {
		return "home";
	}
	
	@GetMapping("carrello")
	public String carrello() {
		return "carrello";
	}

	@GetMapping("utenti")
	public String utenti() {
		return "utenti";
	}
	
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	@GetMapping("registrazione")
	public String registrazione() {
		return "registrazione";
	}
}
