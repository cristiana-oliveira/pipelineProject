package demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Entity;

import java.util.Collections;

@RestController

public class HelloController {

    @GetMapping(path = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> welcome(@RequestParam String name) {
        if (name == null) {
            return null;
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body(
                    Collections.singletonMap("name", name));
        }
    }
}
