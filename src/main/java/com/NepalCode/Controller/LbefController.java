package com.NepalCode.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LbefController {
	
	@ResponseBody
	@RequestMapping("/title")
	public String webTitle() {
		return "welcome to home page";
	}

}
