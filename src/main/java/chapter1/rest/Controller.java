package chapter1.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
final public class Controller {
    @RequestMapping("/hello")
    public String greeting()  {
        return "Hello world";
    }
}
