package com.tperuch.kafka_starter.endpoint;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message){
        //implementar service
        return "mensagem "+message+" enviada";
    }
}
