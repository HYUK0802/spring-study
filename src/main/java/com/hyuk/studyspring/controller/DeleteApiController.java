package com.hyuk.studyspring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api3")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable("userId") String userId, @RequestParam("account") String account) {
        System.out.println(userId);
        System.out.println(account);
    }
}
