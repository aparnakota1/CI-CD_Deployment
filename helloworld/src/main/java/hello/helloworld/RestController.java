package hello.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestController {
	@RequestMapping("/")
	public String firstHandler() {
		return "inde x";
	}
}
