package com.tree.treeaicodemather.ai;

import com.tree.treeaicodemather.ai.model.HtmlCodeResult;
import com.tree.treeaicodemather.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCodeGeneratorServiceTest {
    @Resource
    private AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHtmlCode() {
       HtmlCodeResult result= aiCodeGeneratorService.generateHtmlCode("做个程序员lefttooth的博客，不超过二十行");
       Assertions.assertNotNull(result);
    }

    @Test
    void generateMultiFileCode() {
        MultiFileCodeResult result= aiCodeGeneratorService.generateMultiFileCode("做个程序员lefttooth的留言板，不超过50行");
        Assertions.assertNotNull(result);
    }
}