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
	
	void say(String isSaying) {
		System.out.println(isSaying);
	}
}

class Duck extends Bird {
	void swim() {
		System.out.println("I am swimming");
	}
	
	void sing() {
		say("Quack, quack");
	}
}

class Chicken extends Bird {
	
	void sing() {
		say("Cluck, cluck");
	}
	
	void fly() {
		try {
			throw new Exception("A chicken cannot fly!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Rooster extends Chicken {
	void sing() {
		say("Cock-a-doodle-doo");
	}
}

class Parrot extends Bird {
	String isSaying;
	public Parrot(String isSaying) {
		this.isSaying = isSaying;
	}
	
	void sing() {
		say(isSaying);
	}
}

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		Duck duck = new Duck();
		duck.sing();
		
		Chicken chicken = new Chicken();
		chicken.sing();
		
		Rooster rooster = new Rooster();
		rooster.sing();
		
		Parrot parrotLivingWithDogs = new Parrot("Woof, woof");
		parrotLivingWithDogs.sing();
		
		Parrot parrotLivingWithCats = new Parrot("Meow");
		parrotLivingWithCats.sing();
		
		Parrot parrotLivingWithRooster = new Parrot("Cock-a-doodle-doo");
		parrotLivingWithRooster.sing();
	}
}
