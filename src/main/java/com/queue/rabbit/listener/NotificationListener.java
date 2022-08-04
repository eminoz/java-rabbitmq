package com.queue.rabbit.listener;

import com.queue.rabbit.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {
    @RabbitListener(queues = "eminoz-queue")
    public void handleMessage(Notification notification) {
        System.out.println(notification.toString());
    }

}
