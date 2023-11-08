package com.projectscaffold.resource;

import com.projectscaffold.resource.response.WelcomeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldResource {


    @GetMapping("/hello-world/{name}")
    public ResponseEntity<WelcomeResponse> createPayment(@PathVariable String name) {
        return ResponseEntity.ok(new WelcomeResponse(name));
    }


}
