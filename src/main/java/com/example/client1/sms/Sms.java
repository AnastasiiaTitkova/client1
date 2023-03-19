package com.example.client1.sms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sms {
    @GetMapping("/sms")
    public String sendSms(){
        System.out.println("sms was sent");
        return "sms was sent";
    }
}

