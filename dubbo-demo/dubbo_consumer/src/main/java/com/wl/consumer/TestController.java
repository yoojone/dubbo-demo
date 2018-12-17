package com.wl.consumer;

import com.wl.api.req.Student;
import com.wl.api.resp.Teacher;
import com.wl.api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyq
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/say")
    public String say(String msg){

        return testService.sayhello(msg);
    }

    @GetMapping("/teacher")
    public Teacher tea(Student student){

        return testService.getTeacher(student);
    }
}
