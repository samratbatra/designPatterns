package com.samrat.patterns.creational.builder;

public class HttpClient {
	
	private String method;
	private String url;
	private String userName;
	private String headers;
	private String password;
	private String body;
	
	public HttpClient(String method, String url, String userName, String headers, String password, String body) {
		super();
		this.method = method;
		this.url = url;
		this.userName = userName;
		this.headers = headers;
		this.password = password;
		this.body = body;
	}
	
	public HttpClient(HttpClientBuilder httpClientBuilder) {
		this.method = httpClientBuilder.method;
		this.url = httpClientBuilder.url;
		this.body = httpClientBuilder.body;
		this.headers = httpClientBuilder.headers;
		this.userName  = httpClientBuilder.userName;
		this.password = httpClientBuilder.password;
	}

	@Override
	public String toString() {
		return "HttpClient [method=" + method + ", url=" + url + ", userName=" + userName + ", headers=" + headers
				+ ", password=" + password + ", body=" + body + "]";
	}
	
	public static class HttpClientBuilder{
		private String method;
		private String url;
		private String userName;
		private String headers;
		private String password;
		private String body;
		
		public HttpClientBuilder method(String method) {
			this.method = method;
			return this;
		}
		
		public HttpClientBuilder url(String url) {
			this.url = url;
			return this;
		}
		
		public HttpClientBuilder userName(String userName) {
			this.userName = userName;
			return this;
		}
		
		public HttpClientBuilder headers(String headers) {
			this.headers = headers;
			return this;
		}
		
		public HttpClientBuilder password(String password) {
			this.password = password;
			return this;
		}
		
		public HttpClientBuilder body(String body) {
			this.body = body;
			return this;
		}
		
		public HttpClient build() {
			return new HttpClient(this);
		}

		@Override
		public String toString() {
			return "HttpClientBuilder [method=" + method + ", url=" + url + ", userName=" + userName + ", headers="
					+ headers + ", password=" + password + ", body=" + body + "]";
		}
		
		
		
	}
	
	
	
	
	

}
