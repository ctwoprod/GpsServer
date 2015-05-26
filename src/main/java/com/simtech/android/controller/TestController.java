package com.simtech.android.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/data")
public class TestController {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {

		model.addAttribute("movie", name);
		return "list";

	}

	@RequestMapping(value = "/{longitude}/{latitude}", method = RequestMethod.GET)
	public @ResponseBody HashMap<String, Object> test(
			@PathVariable String longitude, @PathVariable String latitude,
			ModelMap model) {

		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("longitude", longitude);
		result.put("latitude", latitude);
		return result;

	}

}