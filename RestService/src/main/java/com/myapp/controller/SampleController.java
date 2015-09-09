package com.myapp.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration

public class SampleController {
	@RequestMapping("/hello")
	@ResponseBody
	String home(){
		return " Hello Java World !!! ";
	}


}
