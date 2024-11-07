package com.example.my_spring_app.controller;

import com.example.my_spring_app.model.WebpushSubscription;
import com.example.my_spring_app.repository.WebpushSubscriptionRepository;
import com.example.my_spring_app.service.WebpushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/letrworks/web-push")  // 기본 경로를 /web-push로 설정
public class WebpushController {
//    @Autowired
//    private SubscriptionRepository subscriptionRepository;
//
//    @Autowired
//    private WebPushService webPushService;
//
//    @GetMapping("/send-notifications")
//    public String sendNotifications() {
//        List<Subscription> subscriptions = subscriptionRepository.findAll();
//        String payload = "{\"title\":\"New Notification\",\"body\":\"Hello from web push!\"}";
//        webPushService.sendNotification(subscriptions, payload);
//        return "Notifications sent to all subscribers";
//    }
}
