package com.example.client1.sms;

import org.springframework.web.bind.annotation.*;

@RestController
public class Sms {
    @RequestMapping(value="/sms", method= RequestMethod.POST)
    public String sendSms(){
        System.out.println("sms was sent");
        return "sms was sent";
    }
}

