package com.campushub.community;

import com.campushub.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * ClassName: MailTest
 * Package: com.campushub.community
 * Description:
 *
 * @Author 欣欣欣
 * @Create 2025/2/21 18:26
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTest {
    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine; //引入模板引擎，用于生成动态html页面

    @Test
    public void TestTextMail(){
        mailClient.sendMail("13400270997@163.com", "text", "发送邮件测试");
    }

    @Test
    public void TestHtmlMail(){
        Context context = new Context();
        context.setVariable("username", "sunday");
        String content = templateEngine.process("/mail/demo", context);
        System.out.println(content);

        mailClient.sendMail("13400270997@163.com", "HTML", content);
    }


}
