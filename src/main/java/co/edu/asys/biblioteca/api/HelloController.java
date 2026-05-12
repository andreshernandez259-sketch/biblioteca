package co.edu.asys.biblioteca.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping ("/")
    public String hello () {
        return "hola mundo";
    }

}
