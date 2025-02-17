package com.itbaizhan.springbootandmybatisdemo1.mapper;

import com.itbaizhan.springbootandmybatisdemo1.domain.Student;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        Student student = Student.builder().id(null).name("优香").sex("女").address("前年").build();

        studentMapper.insert(student);

        System.out.println(student.getId());
    }

    @Test
    public void testUpdate(){
        Student student = new Student();
        student.setAddress("千年");
        student.setId(1535127557);
        studentMapper.updateById(student);
    }

    //根据id删除
    @Test
    public void testDelete1(){
        studentMapper.deleteById(1535127557);
    }

    //批量删除
    @Test
    public void testDelete2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1535127556);
        list.add(1535127557);
        studentMapper.deleteBatchIds(list);
    }

    //根据字段条件删除
    public void testDelete3(){
        Map<String ,Object> map = new HashMap();
        map.put("sex","男");
    }
}
