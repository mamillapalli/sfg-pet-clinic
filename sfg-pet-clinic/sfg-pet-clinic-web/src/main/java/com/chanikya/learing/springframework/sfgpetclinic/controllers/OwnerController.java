package com.chanikya.learing.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chanikya.learing.springframework.sfgpetclinic.services.OwnerService;

@Controller
@RequestMapping("/owner")
public class OwnerController {

	OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}

	@RequestMapping({ "", "/", "index", "index.htm", "index.html" })
	public String listOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owner/index";
	}

}
