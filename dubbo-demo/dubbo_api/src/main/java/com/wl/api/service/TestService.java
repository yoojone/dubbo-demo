package com.wl.api.service;

import com.wl.api.req.Student;
import com.wl.api.resp.Teacher;

public interface TestService {

    String sayhello(String msg);

    Teacher getTeacher(Student student);
}
