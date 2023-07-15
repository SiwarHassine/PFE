package com.c2s.dsif.controllers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c2s.dsif.entities.Project;
@CrossOrigin("*")
@RestController
@RequestMapping("/back")
public class Controller {
	

	
	
	 @PostMapping("/executeScript")
	    public void executeScript(@RequestBody Project project) throws IOException, InterruptedException {
		    try {
		        FileWriter fw = new FileWriter("C:/Users/s.hassine/Documents/script.sh");

		        PrintWriter pw = new PrintWriter(fw);

		        pw.println("#!/bin/bash");
		        pw.println("echo hello ! We gonna generate your project ");
		        pw.println("cd /c/Users/$USERNAME/Downloads");
		        pw.println("mvn archetype:generate -DgroupId="+project.getProjectgroup()
		        		+" -DartifactId="+project.getProjectname()+" -Dversion="+project.getProjectversion()
		        		+" -DarchetypeCatalog=local -DarchetypeGroupId=com.c2s.dsif -DarchetypeArtifactId=socleit-parent-archetype -DarchetypeVersion=0.0.1-SNAPSHOT -DinteractiveMode=false");
		        pw.close();
		    } catch (IOException e1) {
		        // TODO Auto-generated catch block
		        e1.printStackTrace();
		    }
		    
		    
		    try {
		    	String[] cmd = { "cmd.exe", "/c", "C:/Users/s.hassine/Documents/script.sh" };
		    	Process process = Runtime.getRuntime().exec(cmd);
		    	process.waitFor(); 
		    } catch (IOException e) {
		     
		        e.printStackTrace();
		    }
	  
	    }
}
