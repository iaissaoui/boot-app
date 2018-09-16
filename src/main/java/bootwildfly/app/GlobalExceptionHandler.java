package bootwildfly.app;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackages = { "bootwildfly.app.controller" })
public class GlobalExceptionHandler {

	public static final String DEFAULT_ERROR_VIEW = "errorpage";

	@ExceptionHandler(value = Exception.class)
	public String defaultErrorHandler(HttpServletRequest req, Model m, Exception e) throws Exception {

//		ModelAndView mav = new ModelAndView();
//		mav.addObject("param", "param");
//		mav.addObject("exception", e);
//		mav.addObject("url", req.getRequestURL());
//		mav.setViewName(DEFAULT_ERROR_VIEW);

		m.addAttribute("param", "using model");
		m.addAttribute("exception", e);
		m.addAttribute("url", req.getRequestURL());

		return DEFAULT_ERROR_VIEW;
	}

}
