package com.itbaizhan.springbootandmybatisdemo1.mapper;

import com.itbaizhan.springbootandmybatisdemo1.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentMapperTest {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test(){
        Student student = studentMapper.selectById(1);
        System.out.println(student);
    }
}
