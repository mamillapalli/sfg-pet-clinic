package com.chanikya.learing.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pet")
public class PetController {

	@RequestMapping({ "", "/", "index.html", "index", "index.htm" })
	public String listPets() {
		return "pet/index";
	}
}
