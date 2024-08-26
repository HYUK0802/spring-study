package com.hyuk.studyspring.controller;

import com.hyuk.studyspring.dto.PostRequestDto;
import com.hyuk.studyspring.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api2")
public class PutApiController {

//    @PutMapping("/put")
//    public PutRequestDto put(@RequestBody PutRequestDto requestDto) {
//        System.out.println(requestDto);
//        return requestDto;
//    }
        @PutMapping("/put/{userId}")
        public PutRequestDto put(@RequestBody PutRequestDto requestDto, @PathVariable("userId") Long id) {
            System.out.println(id);
            return requestDto;
        }
}
