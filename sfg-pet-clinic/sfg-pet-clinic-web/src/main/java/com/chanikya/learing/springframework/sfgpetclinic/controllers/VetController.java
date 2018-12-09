package com.chanikya.learing.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chanikya.learing.springframework.sfgpetclinic.services.VetService;

@Controller
@RequestMapping("/vet")
public class VetController {

	VetService vetService;

	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}

	@RequestMapping({ "", "/", "index.html", "index", "index.htm" })
	public String listVets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vet/index";
	}

}
