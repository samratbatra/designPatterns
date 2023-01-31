package com.samrat.patterns.behavioural.iterator;

public class Test {

	public static void main(String[] args) {
		ProductCollection productCollection = new ProductCollection();
		productCollection.addProduct(new Product("A"));
		productCollection.addProduct(new Product("B"));
		productCollection.addProduct(new Product("C"));
		
		Iterator iterator = productCollection.creteIterator();
		while(iterator.hasNext()) {
			Product product = (Product) iterator.next();
			System.out.println(product.getName());
		}
	}

}
