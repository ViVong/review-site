package org.wecancodeit.review;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {
	
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	
	//@RequestMapping()
}
