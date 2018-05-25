package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository repo;

    @RequestMapping("/register")
    public RedirectView register(@RequestParam(value="name") String name,
    					 @RequestParam(value="lastName") String lastName,
    					 @RequestParam(value="age") int age,
    					 @RequestParam(value="gender") Gender gender,
    					 @RequestParam(value="email") String email,
    					 @RequestParam(value="password") String password,
    					 @RequestParam(value="passwordConf") String passwordConf) {
    	
    	
		User user = new User(name, lastName, age, gender, email, password);
		repo.save(user);
		return new RedirectView("login.html");
    }
    
}