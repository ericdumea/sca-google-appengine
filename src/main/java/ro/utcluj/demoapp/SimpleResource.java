package ro.utcluj.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleResource {

    @GetMapping("/")
    public String hello() {
        return "Hello, from the cloud, where is no lockdown :)";
    }

}
