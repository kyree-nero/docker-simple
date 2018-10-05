package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/content")
	public DemoContent content() {
		DemoContent response = new DemoContent();
		response.setId(1);
		response.setText("x");
		return response;
	}
}
