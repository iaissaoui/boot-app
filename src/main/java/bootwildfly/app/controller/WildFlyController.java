package bootwildfly.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WildFlyController {

	@Value("${spring.application.name}")
	private String appName;
	@Value("IntelliJ")
	private String ide;

	@GetMapping("/")
	public String sayHello(Model m) {

		m.addAttribute("appName", appName);
		return "slash";
	}
}