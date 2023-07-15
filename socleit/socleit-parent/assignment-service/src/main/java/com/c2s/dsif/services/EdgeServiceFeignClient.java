package com.c2s.dsif.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.c2s.dsif.entities.EdgeServiceDTO;

@FeignClient(name = "edgeservices",configuration = FeignConfig.class)

public interface EdgeServiceFeignClient {
	

	@GetMapping("/findall")
	List<EdgeServiceDTO> retrieveAllEdgeServices();

	@GetMapping("/findbyid/{id}")
	EdgeServiceDTO retrieveEdgeService(@PathVariable("id") Long id);
	
	@GetMapping("/usedport")
	public int getPort();
	
	

}
