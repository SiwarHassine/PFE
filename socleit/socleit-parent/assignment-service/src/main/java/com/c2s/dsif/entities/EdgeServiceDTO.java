package com.c2s.dsif.entities;


public class EdgeServiceDTO {
	private Long id;
	private String name;
	private int serverPort;

	

	public EdgeServiceDTO(Long id, String name, int serverPort) {
		super();
		this.id = id;
		this.name = name;
		this.serverPort = serverPort;
	}
	

	public int getServerPort() {
		return serverPort;
	}
	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
