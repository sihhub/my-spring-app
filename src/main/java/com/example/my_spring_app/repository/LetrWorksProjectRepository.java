package com.example.my_spring_app.repository;


import com.example.my_spring_app.model.LetrWorksProject;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LetrWorksProjectRepository extends MongoRepository<LetrWorksProject, String> {
    // 기본적인 CRUD 메서드를 사용할 수 있습니다.
}
