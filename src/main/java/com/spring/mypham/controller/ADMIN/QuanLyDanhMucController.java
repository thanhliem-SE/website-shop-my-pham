package com.spring.mypham.controller.ADMIN;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "QLDMAdminControllerAdmin")
@RequestMapping("/admin")
public class QuanLyDanhMucController {
	@GetMapping("/quanlydanhmuc")
	public String managerAdmin(Model model) {
		return "admin/quanlydanhmuc";
	}
}