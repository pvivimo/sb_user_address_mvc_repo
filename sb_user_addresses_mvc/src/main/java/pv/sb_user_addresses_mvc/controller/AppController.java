package pv.sb_user_addresses_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pv.sb_user_addresses_mvc.dto.UserDto;
import pv.sb_user_addresses_mvc.service.AppService;

@Controller
public class AppController {
	
	private AppService service;
	
	@Autowired
	public AppController(AppService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping("/user/{userid}")
	public String showUser(
				Model model,
				@PathVariable("userid") int userId			
			) {
		
		UserDto dto = service.getUserById(userId);
		model.addAttribute("userdto", dto);
		
		return "user.html";
	}
}
