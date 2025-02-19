package com.itbaizhan.springbootandmybatisdemo1.mapper;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itbaizhan.springbootandmybatisdemo1.domain.Student;


import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

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

    //根据id查询
    @Test
    public void testQuery1(){
        Student student = studentMapper.selectById(4);
        System.out.println(student);
    }

    //批量查询
    @Test
    public void testQuery2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Student> students = studentMapper.selectBatchIds(list);
        students.forEach(System.out::println);
    }

    //根据字段条件查询
    @Test
    public void testQuery3(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("sex","女");
        List<Student> students = studentMapper.selectByMap(map);
        students.forEach(System.out::println);
    }

    @Test
    public void ArAdd(){
        Student student = new Student(6,"邮箱","女","千年");
        student.insert();
    }

    @Test
    public void ArUpdate(){
        Student student = new Student(7,"莉音","女","千年");
        student.setName("王小桃");
        student.setId(6);
        student.updateById();

    }

    @Test
    public void ArDel(){
        Student student = new Student();
        student.setId(6);
        student.deleteById();
    }

    @Test
    public void ArFind(){
        Student student = new Student();
        student.setId(3);
        Student student1 = student.selectById();
        System.out.println(student1);
    }

    @Test
    public void ArFind2(){
        Student student = new Student();
        List<Student> students = student.selectAll();
        students.forEach(System.out::println);
    }

    @Test
    public void testPage(){
        Page page = new Page(0,2);
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","百战").eq("sex","女");
        Student student = new Student();
        IPage page1 = student.selectPage(page, queryWrapper);
        page1.getRecords().forEach(System.out::println);
        long current = page1.getCurrent();
        long size = page1.getSize();
        long total = page.getTotal();
        System.out.println(current+","+size+","+total);
    }
}
