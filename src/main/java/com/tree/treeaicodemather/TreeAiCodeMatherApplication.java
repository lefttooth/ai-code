package com.tree.treeaicodemather;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@MapperScan("com.tree.treeaicodemather.mapper")

@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})

@EnableCaching

public class TreeAiCodeMatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(TreeAiCodeMatherApplication.class, args);
    }

}
