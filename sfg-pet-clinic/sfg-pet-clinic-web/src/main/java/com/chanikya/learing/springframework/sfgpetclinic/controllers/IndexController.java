package com.chanikya.learing.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping({ "", "/", "index", "index.html" })
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping({ "/oups"  })
	public String errorPage() {
		return "error";
	}	
}
