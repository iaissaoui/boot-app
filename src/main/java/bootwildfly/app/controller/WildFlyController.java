package bootwildfly.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WildFlyController {

	@GetMapping("/slash")
	public String sayHello() {
		return "slash";
	}
}