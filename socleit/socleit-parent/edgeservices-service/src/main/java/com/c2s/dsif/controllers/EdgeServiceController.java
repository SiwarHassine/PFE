package com.c2s.dsif.controllers;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.c2s.dsif.entities.EdgeService;
import com.c2s.dsif.repositories.EdgeServiceRepository;

@RestController

public class EdgeServiceController {
	

	@Value("${server.port}")
	private int serverport;

	@Autowired
	EdgeServiceRepository edgeServiceRepository;
	
	private String header="Authorization";
	
	@GetMapping("/findall")
	public List<EdgeService> findAllEdgeServices() {
		return edgeServiceRepository.findAll();
	}

	@PostMapping("/add")
	public EdgeService addEdgeService(@RequestBody EdgeService edgeService) {
		return edgeServiceRepository.save(edgeService);
	}

	@GetMapping("/findbyid/{id}")
	public Optional<EdgeService> findEdgeService(@PathVariable("id") Long id){
	  
		return edgeServiceRepository.findById(id);
	}

	@GetMapping("/usedport")
	public int getPort() {
		return serverport;
	}
	
	 @GetMapping("/home")
	    public String home(Principal principal) {
	        return "Hello, " + principal.getName();
	    }

}
