package br.com.financas.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

	@GetMapping(value = "/teste")
	public String apiString() {
		return "Hello word";
	}
}
