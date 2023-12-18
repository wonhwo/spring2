package com.spring.mvc;

import com.spring.mvc.chap06.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/rests")
@Slf4j
public class RestApiController {

    @GetMapping("/hello")
//    @ResponseBody  // 클라이언트에게 JSP를 보내는게 아니라 JSON을 보내는 방법
    public String hello() {
        log.info("/rest/hello GET!");
        return "hello apple banana!!";
    }

    @GetMapping("/food")
//    @ResponseBody
    public List<String> food() {
        return List.of("짜장면", "볶음밥", "탕수육");
    }

    @GetMapping("/person")
    public Person person() {
        return new Person("334", "말포이", 50);
    }

}
