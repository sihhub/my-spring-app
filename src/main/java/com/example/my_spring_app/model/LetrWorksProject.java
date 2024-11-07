package com.example.my_spring_app.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Map;

import lombok.Data;

@Document(collection = "projects")
@Data
public class LetrWorksProject {
    @Id
    private String id;
    private String title;
    private String groupId;
    private String workspaceId;


}
