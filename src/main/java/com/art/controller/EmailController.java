package com.art.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;

/**
 *  Контроллер для отправки сообщения
 */
@Controller
@RequestMapping("/sendEmail")
public class EmailController {
    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping(method = RequestMethod.POST)
    public  String sendEmail(HttpServletRequest request, @RequestParam final CommonsMultipartFile attachFile ) {

        //  Взяли данные с страницы

        final String emailTo = request.getParameter("mailTo");
        final String subject = request.getParameter("subject");
        final String message = request.getParameter("message");

         //Анонимный клас для отправки

        mailSender.send(new MimeMessagePreparator(){

            @Override
            public void prepare(MimeMessage mimeMessage) throws Exception {
                MimeMessageHelper messageHelper = new MimeMessageHelper(
                        mimeMessage, true, "UTF-8");
                messageHelper.setTo(emailTo);
                messageHelper.setSubject(subject);
                messageHelper.setText(message);
                // Проверяем есть ли прикрепленный файл
                String attachName = attachFile.getOriginalFilename();
                if (!attachName.equals("")) {
                    messageHelper.addAttachment(attachName, new InputStreamSource() {
                        @Override
                        public InputStream getInputStream() throws IOException {
                            return attachFile.getInputStream();
                        }
                    });
                }
            }
        });
        return "redirect:/";
}
     @RequestMapping (method = RequestMethod.GET)
    public  String newEmail () {
        return  "EmailForm";
     }
    }