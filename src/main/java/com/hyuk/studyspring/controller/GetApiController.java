package com.hyuk.studyspring.controller;

import com.hyuk.studyspring.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {


    @GetMapping(path = "/hello")
    public String getHello() {
        return "get Hello";
    }
    @GetMapping(path = "/hi")
    public String hi() {
        return "hi";
    }

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable("name") String name) {

        System.out.println("PathVariable : " +name);

        return name;
    }

    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String,String> queryParam) {

         StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(
                entry -> {
                    System.out.println(entry.getKey());
                    System.out.println(entry.getValue());
                    System.out.println("\n");

                    sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
                }
        );
        return sb.toString();
    }
    @GetMapping("query-param02")
    public String queryParam02(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("age") int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name+ " " +email+ " "+age;
    }

    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());
        return userRequest.toString();
    }
}
