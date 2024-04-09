package com.cydeo.service.Impl;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.service.ProjectService;
import com.cydeo.enums.Status;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl extends AbstractMapService<ProjectDTO,String> implements ProjectService {
    @Override
    public ProjectDTO save(ProjectDTO object) {


        if(object.getProjectStatus() == null){
            object.setProjectStatus(Status.OPEN);
        }
        return super.save(object.getProjectName(),object);
    }

    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void update(ProjectDTO object) {
     super.update(object.getProjectName(),object);
    }

    @Override
    public void deleteById(String id) {
      super.deleteById(id);
    }

    @Override
    public ProjectDTO findById(String id) {
        return super.findById(id);
    }
}
