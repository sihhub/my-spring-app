package com.example.my_spring_app.service;


import com.example.my_spring_app.model.LetrWorksProject;
import com.example.my_spring_app.repository.LetrWorksProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class LetrWorksProjectService {
    private final LetrWorksProjectRepository projectRepository;

    @Autowired // 의존성 주입을 위한 어노테이션
    public LetrWorksProjectService(LetrWorksProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<LetrWorksProject> getAllProjects() {
        return projectRepository.findAll();
    }

    public List<LetrWorksProject> getProjectsWithPagination(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return projectRepository.findAll(pageable).getContent();
    }
}
