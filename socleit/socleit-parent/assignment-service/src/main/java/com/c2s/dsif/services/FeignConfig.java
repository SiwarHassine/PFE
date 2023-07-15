package com.c2s.dsif.services;


import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import feign.RequestInterceptor;
import feign.RequestTemplate;

@Configuration
public class FeignConfig {
	
	
    public static  RestTemplate restTemplate = new RestTemplate();
	public static final String USERNAME = "Siwar";
	public static final String PASSWORD = "password";
	
	
	public static String getToken() {
	    RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:9000/token"; // Remplacez l'URL par celle de votre premier microservice
	    String username = "Siwar";
	    String password = "password";
	    String authHeader = "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
	    HttpHeaders headers = new HttpHeaders();
	    headers.set("Authorization", authHeader);
	    HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
	    ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
	    return response.getBody(); // Renvoie le corps de la réponse, qui devrait contenir le token JWT
	}
    @Bean
   public static RequestInterceptor requestInterceptor () {
        return template -> {
        	 
        	    String token=FeignConfig.getToken();
                template.header("Authorization", "Bearer " + token);
            };
        }
    }

