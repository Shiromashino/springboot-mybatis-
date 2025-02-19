package com.itbaizhan.springbootandmybatisdemo1.domain;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("student")
public class Student extends Model<Student> {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @TableField(value = "name")
    private String name;
    private String sex;
    private String address;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;
}

//实体类转表名：
//Student → student
//UserInfo → user_info
//OrderDetail → order_detail
//这叫做"驼峰转下划线"命名规则：
//
//大写字母会变成小写，并在前面加上下划线
//第一个大写字母只会变成小写，前面不加下划线