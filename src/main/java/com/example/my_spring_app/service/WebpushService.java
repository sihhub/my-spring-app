package com.example.my_spring_app.service;

import com.example.my_spring_app.model.WebpushSubscription;
//import nl.martijndwars.webpush.Notification;
//import nl.martijndwars.webpush.PushService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebpushService {
//    private final PushService pushService;
//
//    public WebPushService(@Value("${webpush.vapid.public_key}") String publicKey,
//                          @Value("${webpush.vapid.private_key}") String privateKey,
//                          @Value("${webpush.vapid.subject}") String subject) throws Exception {
//        this.pushService = new PushService();
//        pushService.setPublicKey(publicKey);
//        pushService.setPrivateKey(privateKey);
//        pushService.setSubject(subject);
//    }
//
//    public void sendNotification(List<Subscription> subscriptions, String payload) {
//        subscriptions.forEach(subscription -> {
//            try {
//                Notification notification = new Notification(
//                        subscription.getEndpoint(),
//                        subscription.getKeys().getP256dh(),
//                        subscription.getKeys().getAuth(),
//                        payload.getBytes()
//                );
//                pushService.send(notification);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//    }
}
