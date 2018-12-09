package com.chanikya.learing.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {
	@RequestMapping({ "", "/", "index", "index.htm", "index.html" })
	public String listOwners() {
		return "owner/index";
	}

}
