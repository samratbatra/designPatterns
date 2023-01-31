package com.samrat.patterns.creational.builder;

public class Test {

	public static void main(String[] args) {
		HttpClient httpClient = new HttpClient.HttpClientBuilder().body("").password("password").url("url").userName("username").build();
		System.out.println(httpClient);
	}

}
