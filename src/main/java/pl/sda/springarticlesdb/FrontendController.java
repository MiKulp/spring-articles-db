package pl.sda.springarticlesdb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/frontend")
public class FrontendController {

	@GetMapping
	public ModelAndView showHelloPage() {
		return new ModelAndView("hello", Map.of("name", "goobar"));
	}
}
