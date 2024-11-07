package com.example.my_spring_app.controller;

import com.example.my_spring_app.model.LetrWorksProject;
import com.example.my_spring_app.service.LetrWorksProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RestController
@RequestMapping("/api/letrworks/projects")
public class LetrWorksProjectController {
    private final LetrWorksProjectService projectService;

    @Autowired
    public LetrWorksProjectController(LetrWorksProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<LetrWorksProject> getProjects(
            @RequestParam(defaultValue = "0") int page,// 기본값: 첫 번째 페이지
            @RequestParam(defaultValue = "10") int size // 기본값: 10개씩
    ) {
        return projectService.getProjectsWithPagination(page, size);
    }
}
