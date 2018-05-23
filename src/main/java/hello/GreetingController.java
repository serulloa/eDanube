package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/hola")
    public User greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new User("Sergio", "Ulloa", 23, Gender.MALE, "polloloco");
    }
    
}