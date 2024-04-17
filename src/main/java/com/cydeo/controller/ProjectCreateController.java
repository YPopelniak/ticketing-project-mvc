package com.cydeo.controller;


import com.cydeo.dto.ProjectDTO;
import com.cydeo.enums.Status;
import com.cydeo.service.ProjectService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    model.addAttribute("managers", userService.findManagers());

            return "project/create";

        }
        @PostMapping("/create")
        public String insertProject(ProjectDTO project){

        projectService.save(project);

        return "redirect:/project/create";
        }

        @GetMapping("/delete/{projectcode}")
    public String deleteProject(@PathVariable("projectcode") String projectcode){
        projectService.deleteById(projectcode);
       return "redirect:/project/create";
        }
}
