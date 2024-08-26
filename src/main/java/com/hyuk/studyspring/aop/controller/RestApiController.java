package com.hyuk.studyspring.aop.controller;


//import com.example.hello.aop.dto.User;
import com.hyuk.studyspring.validation.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api5")
public class RestApiController {

    @GetMapping("/get/{id}")
    public void get(@PathVariable("id") Long id, @RequestParam("name") String name) {
        System.out.println("get method");
        System.out.println("get method : " +id);
        System.out.println("get method : " +name);

    }

    @PostMapping("/post")
    public void post(@RequestBody com.hyuk.studyspring.validation.dto.User user) {
        System.out.println("post method : " + user);
    }
}
