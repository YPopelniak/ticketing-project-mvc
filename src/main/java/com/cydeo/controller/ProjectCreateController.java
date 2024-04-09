package com.cydeo.controller;


import com.cydeo.dto.ProjectDTO;
import com.cydeo.service.ProjectService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/project")
public class ProjectCreateController {
    ProjectService projectService;
    UserService userService;

    public ProjectCreateController(ProjectService projectService, UserService userService){
        this.projectService = projectService;
        this.userService = userService;

    }

        @GetMapping("/create")
        public String createUser(Model model){

    model.addAttribute("project" , new ProjectDTO());
    model.addAttribute("projects", projectService.findAll());
    model.addAttribute("managers", userService.findAll());

            return "project/create";

        }
}
