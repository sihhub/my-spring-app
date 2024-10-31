package com.example.my_spring_app.repository;

import com.example.my_spring_app.model.WebpushSubscription;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface WebpushSubscriptionRepository  extends MongoRepository<WebpushSubscription, String>{
}
