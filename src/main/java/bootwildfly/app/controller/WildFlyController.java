package bootwildfly.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WildFlyController {

	@Value("${spring.application.name}")
	private String appName;

//	@Autowired
//	AppUserRepo AUR;

	@GetMapping("/")
	public String landOnRoot(Model m) {

		String cwd = System.getProperty("user.dir");

		m.addAttribute("appName", appName);
		m.addAttribute("cwd", cwd);

//		AppUser au = new AppUser();
//		au.setName("ia");
//
//		AUR.save(au);

		return "slash";
	}

	@GetMapping("/slash")
	public String landOnSlash(Model m) throws Exception {
		m.addAttribute("appName", appName);

		Integer i = null;
		Integer j = i + 1;

		return "slash";
	}
}