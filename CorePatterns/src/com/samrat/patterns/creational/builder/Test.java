package com.samrat.patterns.creational.builder;

import com.samrat.patterns.creational.builder.HttpClient.HttpClientBuilder;

public class Test {

	public static void main(String[] args) {

		HttpClientBuilder httpClientBuilder = new HttpClient.HttpClientBuilder();
		httpClientBuilder.body("").password("password").url("url").userName("username").build();
		System.out.println(httpClientBuilder);
	}

}
