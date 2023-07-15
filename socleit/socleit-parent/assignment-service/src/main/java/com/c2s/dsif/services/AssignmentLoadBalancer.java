package com.c2s.dsif.services;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

import feign.Feign;

@LoadBalancerClient(name="edgeservices")
public class AssignmentLoadBalancer {
	
  @LoadBalanced
  @Bean
  public Feign.Builder feignBuilder(){
		
	return Feign.builder();
	
		}

}
