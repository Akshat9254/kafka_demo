package com.bmsce.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "demoTopic", groupId = "groupId")
    public void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
