package com.c2s.dsif.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.c2s.dsif.entities.Project;



public interface ProjectRepository extends JpaRepository <Project, Long> {
	
	@Query("SELECT p FROM Project p where p.projectname=projectname")
   <Optional> Project getByName (@Param("projectname") String projectname);
	
}
