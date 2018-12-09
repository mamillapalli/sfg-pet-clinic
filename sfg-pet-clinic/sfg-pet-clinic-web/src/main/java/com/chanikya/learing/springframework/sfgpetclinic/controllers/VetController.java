package com.chanikya.learing.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vet")
public class VetController {

	@RequestMapping({ "", "/", "index.html", "index", "index.htm" })
	public String listVets() {
		return "vet/index";
	}

}
