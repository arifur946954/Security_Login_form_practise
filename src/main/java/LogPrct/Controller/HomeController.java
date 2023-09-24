package LogPrct.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import LogPrct.Entity.User;
import LogPrct.Service.UserService;
import jakarta.servlet.http.HttpSession;
@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/signin")
	public String login() {
		return "login";
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "profile";
	}
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute User user,HttpSession session) {
	User u=	userService.saveUser(user);
	System.out.println(u);
	if(u!=null) {
		session.setAttribute("msg", "Regiseter Successfully ");
		
	}
	else {
		session.setAttribute("msg", "Regiseter Failed pls try again ");
	}
		
		return "redirect:/register";
	}
	
	

}
