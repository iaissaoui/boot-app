package bootwildfly.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import bootwildfly.app.model.AppUser;
import bootwildfly.app.repo.AppUserRepo;

@Controller
public class WildFlyController {

	@Value("${spring.application.name}")
	private String appName;
	@Value("IntelliJ")
	private String ide;

	@Autowired
	AppUserRepo AUR;

	@GetMapping("/")
	public String sayHello(Model m) {

		m.addAttribute("appName", appName);

		AppUser au = new AppUser();
		au.setName("ia");

		// AUR.save(au);

		return "slash";
	}
}