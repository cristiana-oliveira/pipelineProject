package demo.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @GetMapping("/hello")
    public String welcome(@RequestParam String name) {
        if (name == null) {
            return null;
        } else {
            return String.format("Hello %s, welcome to my application!", name);
        }
    }
}