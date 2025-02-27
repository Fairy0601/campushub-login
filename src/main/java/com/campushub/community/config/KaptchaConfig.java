package com.campushub.community.config;

import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * ClassName: KaptchaConfig
 * Package: com.campushub.community.config
 * Description:
 *
 * @Author 欣欣欣
 * @Create 2025/2/25 17:51
 * @Version 1.0
 */
    @Configuration
    public class KaptchaConfig {
        @Bean
        public Producer kaptchaProducer() {
            //对验证码的图形进行配置，由于配置比较繁琐，创建一个properties对象进行配置，而不写在application.properties文件中
            Properties properties = new Properties();
            properties.setProperty("kaptcha.image.width", "100");  //图片的宽
            properties.setProperty("kaptcha.image.height", "40");  //图片的高
            properties.setProperty("kaptcha.textproducer.font.size", "32");  //字体大小
            properties.setProperty("kaptcha.textproducer.font.color", "0,0,0");  //字体颜色
            properties.setProperty("kaptcha.textproducer.char.string", "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");  //生成的随机字符串的范围
            properties.setProperty("kaptcha.textproducer.char.length", "4");  //随机字符串的字符个数为4个
            properties.setProperty("kaptcha.noise.impl", "com.google.code.kaptcha.impl.NoNoise");  //图片中的干扰项

            DefaultKaptcha kaptcha = new DefaultKaptcha();  //Producer的实现类DefaultKaptcha
            Config config = new Config(properties);
            kaptcha.setConfig(config);
            return kaptcha;
        }
    }

