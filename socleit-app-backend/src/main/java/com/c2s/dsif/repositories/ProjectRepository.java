package com.c2s.dsif.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.c2s.dsif.entities.Project;

public interface ProjectRepository extends JpaRepository <Project, String> {

}
