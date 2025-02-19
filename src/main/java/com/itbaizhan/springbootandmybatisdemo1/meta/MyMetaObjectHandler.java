package com.itbaizhan.springbootandmybatisdemo1.meta;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

@Component
//自动填充类实现metaObjectHandler接口
public class MyMetaObjectHandler implements MetaObjectHandler {

    /*
        插入时的填充逻辑
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        //                              填充字段名     字段值    元对象
        this.setFieldValByName("deleted", 0, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
