package com.chanikya.learing.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chanikya.learing.springframework.sfgpetclinic.services.OwnerService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/owners")
@AllArgsConstructor
public class OwnerController {

	OwnerService ownerService;

	@RequestMapping({ "", "/", "index", "index.htm", "index.html", "find" })
	public String listOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owner/index";
	}

}
