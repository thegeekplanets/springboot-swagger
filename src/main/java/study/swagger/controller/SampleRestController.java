package study.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(path = "/api")
@Tag(name = "Tutorial", description = "Tutorial management APIs")
public class SampleRestController {

	@GetMapping(path = "/hello", produces = "application/json")
	@Operation(summary = "Say Hello", description = "Hello Message from API")
	public String helloMessage() {
		return "Hello new World";
	}

}
