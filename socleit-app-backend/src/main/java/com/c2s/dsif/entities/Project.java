package com.c2s.dsif.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Project {
	@Id
	private String projectname ;
	private String projectgroup ;
	private String projectversion ;
	
	
	
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getProjectgroup() {
		return projectgroup;
	}
	public void setProjectgroup(String projectgroup) {
		this.projectgroup = projectgroup;
	}
	public String getProjectversion() {
		return projectversion;
	}
	public void setProjectversion(String projectversion) {
		this.projectversion = projectversion;
	}
	public Project(String projectname, String projectgroup, String projectversion) {
		super();
		this.projectname = projectname;
		this.projectgroup = projectgroup;
		this.projectversion = projectversion;
	}
	
}
