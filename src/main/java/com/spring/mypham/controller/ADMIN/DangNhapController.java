package com.spring.mypham.controller.ADMIN;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "LoginControllerAdmin")
@RequestMapping("/admin")
public class DangNhapController {	
	@GetMapping("/quantricp")
	public String showMyLoginPage() {
		return "admin/login-form";
		
	}
	
}
