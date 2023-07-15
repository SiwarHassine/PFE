package com.c2s.dsif.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public ProjectDTO toDto(Project project) {
        String projectname = project.getProjectname();
        Long id =project.getId();
        return new ProjectDTO(id,projectname, new ArrayList<>());
    }

    public Project toEntity (ProjectDTO projectDTO) {
        Long id = projectDTO.getId();
    	String name = projectDTO.getProjectname();
        List<Long> edgeservices = projectDTO
          .getEdgeservices()
          .stream()
          .map(EdgeServiceDTO::getId)
          .collect(Collectors.toList());

        return new Project(id,name, edgeservices);
    }
  }
