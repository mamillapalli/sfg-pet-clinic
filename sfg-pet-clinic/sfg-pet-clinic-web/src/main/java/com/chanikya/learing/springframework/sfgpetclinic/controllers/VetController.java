package com.chanikya.learing.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chanikya.learing.springframework.sfgpetclinic.services.VetService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
// @RequestMapping("/vets")
public class VetController {

	VetService vetService;

	@RequestMapping({ "/vets", "vets/", "vets.html", "vets/index.html", "vets/index", "vets/index.htm" })
	public String listVets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vet/index";
	}

}
