package hh.swd20.bookstore.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@RequestMapping("/index")
	public String home() {
		return "index";
	}
}
