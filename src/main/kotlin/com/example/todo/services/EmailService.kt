package com.example.todo.services

import jakarta.mail.MessagingException
import jakarta.mail.internet.MimeMessage
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service

@Service
class EmailService {

    lateinit var mailSender: JavaMailSender

    @Autowired
    constructor(mailSender: JavaMailSender) {
        this.mailSender = mailSender
    }

    @Async
    fun sendMail(receiver: String, subject: String, body: String) {
        try {
            var message: MimeMessage = mailSender.createMimeMessage()
            message.setSubject(subject)
            var helper = MimeMessageHelper(message, true)
            helper.setTo(receiver)
            helper.setText(body, true)
            mailSender.send(message)
        } catch (ex: MessagingException) {
            throw ex
        }
    }
}