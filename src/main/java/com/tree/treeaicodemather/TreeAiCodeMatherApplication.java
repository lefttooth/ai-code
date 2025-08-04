package com.tree.treeaicodemather;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.tree.treeaicodemather.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)

public class TreeAiCodeMatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(TreeAiCodeMatherApplication.class, args);
    }

}
