package com.aflacdemo.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/aflac/demo")
public class DemoController {

    @PostMapping
    public ResponseEntity<?> create(){
        return ResponseEntity.ok("hello");
    }

    @GetMapping("/test")
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("Test buddy ");
    }

}
