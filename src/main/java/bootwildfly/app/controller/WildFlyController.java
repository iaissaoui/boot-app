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

	private static Long counter;

	static {

		counter = 0L;
	}

	@Value("${spring.application.name}")
	private String appName;

	@Autowired
	AppUserRepo AUR;

	@GetMapping("/")
	public String landOnRoot(Model m) {

		String cwd = System.getProperty("user.dir");

		m.addAttribute("appName", appName);
		m.addAttribute("cwd", cwd);

		return "slash";
	}

	@GetMapping("/ex")
	public String landOnError(Model m) throws Exception {
		m.addAttribute("appName", appName);

		Integer i = null;
		Integer j = i + 1;

		return "slash";
	}

	@GetMapping("/add")
	public String add(Model m) throws Exception {

		m.addAttribute("appName", appName);
		AppUser au = new AppUser();
		au.setName("iqbal");
		au.setId(counter++);

		AUR.save(au);

		return "slash";
	}
}