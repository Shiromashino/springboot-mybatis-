package com.itbaizhan.springbootandmybatisdemo1;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class MyGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql:///mbook", "root", "root")
                // 全局配置
                .globalConfig(builder -> {
                    builder.author("pxb") // 设置作者
                            .commentDate("MM-dd") // 注释日期格式
                            .outputDir(System.getProperty("user.dir") + "/src/main/java") // 指定输出目录
                            .fileOverride(); //覆盖文件
                })
                // 包配置
                .packageConfig(builder -> {
                    builder.parent("com.itbaizhan.springbootandmybatisdemo1") // 包名前缀
                            .entity("domain") //实体类包名
                            .mapper("mapper") //mapper接口包名
                            .service("service") //service包名
                            .controller("controller") //controller包名
                            .xml("mapper"); //映射文件包名
                })
                // 策略配置
                .strategyConfig(builder -> {
                    builder.addInclude("login") // 设置需要生成的表名,可以有多个
                            .addTablePrefix("") // 设置表名前缀
                            .entityBuilder() // 开始实体类配置
                            .enableLombok() // 开启lombok模型
                            .naming(NamingStrategy.underline_to_camel) //表名下划线转驼峰
                            .columnNaming(NamingStrategy.underline_to_camel);//列名下划线转驼峰
                })
                .execute();
    }
}

