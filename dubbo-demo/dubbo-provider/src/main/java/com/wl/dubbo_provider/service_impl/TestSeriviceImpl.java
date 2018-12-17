package com.wl.dubbo_provider.service_impl;

import com.wl.api.req.Student;
import com.wl.api.resp.Teacher;
import com.wl.api.service.TestService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @author zhangyq
 */
@Service("testService")
public class TestSeriviceImpl implements TestService {
    @Override
    public String sayhello(String msg) {
        return "msg:"+msg;
    }

    @Override
    public Teacher getTeacher(Student student) {
        Teacher teacher = new Teacher();
        BeanUtils.copyProperties(student,teacher);
        return teacher;
    }
}
