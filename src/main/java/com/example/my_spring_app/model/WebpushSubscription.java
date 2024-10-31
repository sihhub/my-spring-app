package com.example.my_spring_app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "webpush.subscriptions")
public class WebpushSubscription {
}
