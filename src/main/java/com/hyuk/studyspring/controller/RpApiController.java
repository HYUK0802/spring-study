package com.hyuk.studyspring.controller;

import com.hyuk.studyspring.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api4")
public class RpApiController {

    // text
    @GetMapping("/text")
    public String text(@RequestParam("account") String account){
        return account;
    }
    // json
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user;
    }
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
