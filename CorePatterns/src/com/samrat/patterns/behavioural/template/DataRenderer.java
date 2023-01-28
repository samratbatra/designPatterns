package com.samrat.patterns.behavioural.template;

public abstract class DataRenderer {

	public void render() {
		
		String data =readData();
		String processedData= processData(data);
		
		System.out.println(processedData);
		
	};
	
	public abstract String readData();
	
	public abstract String processData(String data);
}
