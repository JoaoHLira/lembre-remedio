package br.com.joaolira.lembreremedio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class LembreRemedioApplication {

	@GetMapping
	public String getHomeTest() {
		return "Lembre remedio - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(LembreRemedioApplication.class, args);
	}

}
