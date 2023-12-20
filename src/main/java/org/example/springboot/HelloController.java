package org.example.springboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {


    @GetMapping("api/hello") // Slash muss nicht am Anfang und Ende sein!
    public String helloWorld() {
        return "Hello World";
    }

    @PostMapping("api/hello")
    public String sayHelloTo(@RequestBody String name) {
        System.out.println(name);
        return "Hello " + name;



        }
    }

