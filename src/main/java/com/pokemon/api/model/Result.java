package com.pokemon.api.model;

public class Result {

	private String name;
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getURL() {
		return url;
	}

	public void setURL(String value) {
		this.url = value;
	}

	@Override
	public String toString() {
		return "Result [name=" + name + ", url=" + url + "]";
	}
	
	
}
