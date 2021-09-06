package com.shopme.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	//Main Controller
	@GetMapping("/ShopmeAdmin")
	public String viewPage() {
		return "index";
	}

}
