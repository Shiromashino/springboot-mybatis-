package com.itbaizhan.springbootandmybatisdemo1.mapper;

import com.itbaizhan.springbootandmybatisdemo1.domain.Student;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class studentMapperTest {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testFind(){
        Student student = studentMapper.selectById(1);
        System.out.println(student);
    }

    @Test
    public void testAdd(){
        Student student = Student.builder().id(5).name("宫子").sex("女").address("fox").build();

        studentMapper.insert(student);
        student.getId();
    }
}
