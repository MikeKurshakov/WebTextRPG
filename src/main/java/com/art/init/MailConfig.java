package com.art.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Repository;

import java.util.Properties;
@Configuration
@Repository
public class MailConfig {
    @Bean
    public JavaMailSenderImpl mailSender () {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(465);
        mailSender.setUsername("usenko.job@gmail.com");
        mailSender.setPassword("qwerqwer1416");
        mailSender.setJavaMailProperties(javaMailProperties());
        return  mailSender;
    }
    @Bean
    public Properties javaMailProperties() {
        Properties properties = new Properties();
        properties.setProperty("mail.transport.protocol","smtps");
        properties.setProperty("mail.smtp.auth","true");
        properties.setProperty("mail.smtp.starttls.enable","true");
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        return  properties;
    }
}
