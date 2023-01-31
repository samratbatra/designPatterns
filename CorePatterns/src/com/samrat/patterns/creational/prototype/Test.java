package com.samrat.patterns.creational.prototype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		Game game = new Game();
		game.setId(1);
		game.setName("Overwatch");
		game.setMembership(new Membership());
		
		Game game2 = new Game(game);
		System.out.println(game);
		System.out.println(game2);

	}

}
