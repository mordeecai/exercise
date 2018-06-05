package com.singtel.exercise;

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}
	
	void sing() {
		System.out.println("I am singing");
	}
}

class Duck extends Bird {
	void swim() {
		System.out.println("I am swimming");
	}
	
	void sing() {
		System.out.println("Quack, quack");
	}
}

class Chicken extends Bird {
	
	void sing() {
		System.out.println("Cluck, cluck”");
	}
	
	void fly() {
		try {
			throw new Exception("A chicken cannot fly!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
