package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/register")
    public User register(@RequestParam(value="name") String name,
    					 @RequestParam(value="lastName") String lastName,
    					 @RequestParam(value="age") int age,
    					 @RequestParam(value="gender") Gender gender,
    					 @RequestParam(value="email") String email,
    					 @RequestParam(value="password") String password,
    					 @RequestParam(value="passwordConf") String passwordConf) {
    	
    	if (password.equals(passwordConf))
    		return new User(name, lastName, age, gender, email, password);
    	else 
    		return null;
    }
    
}