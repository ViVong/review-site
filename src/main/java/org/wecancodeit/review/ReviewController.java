package org.wecancodeit.review;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {
	
	@Resource
	ReviewRepository reviewRepo;
	
	@RequestMapping("/")
	public String homePage(Model model) {
		model.addAttribute("reviews", reviewRepo.allReviews());
		return "home";
	}
	
	@RequestMapping("/review")
	public String showOneReview(@RequestParam(value="id") Long id, Model model) {
		model.addAttribute("reviews", reviewRepo.oneReview(id));
		return "review";
	}
	
}
