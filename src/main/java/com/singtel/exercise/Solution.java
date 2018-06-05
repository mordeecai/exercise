package com.singtel.exercise;

interface Swimmer {
	default void swim() {
		System.out.println("I am swimming!");
	}
}

interface Flyer {
	default void fly() {
		System.out.println("I am flying!");
	}
}

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal implements Flyer {
	
	void sing() {
		say("I am singing");
	}
	
	void say(String isSaying) {
		System.out.println(isSaying);
	}
}

class Duck extends Bird implements Swimmer {
	
	void sing() {
		say("Quack, quack");
	}
}

class Chicken extends Bird {
	
	void sing() {
		say("Cluck, cluck");
	}
	
	@Override
	public void fly() {
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
	Parrot(String isSaying) {
		this.isSaying = isSaying;
	}
	
	void sing() {
		say(isSaying);
	}
}

class Fish extends Animal implements Swimmer {
	String size;
	String color;
	
	Fish() {
		
	}
	
	Fish(String size, String color) {
		this.size = size;
		this.color = color;
	}
	
	void walk() {
		try {
			throw new Exception("Fish cannot walk!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Shark extends Fish {
	Shark() {
		super("large", "grey");
	}
	
	void eat(Fish otherFish) {
		System.out.println("I eat " + otherFish.getClass().getSimpleName());
	}
}

class ClownFish extends Fish {
	ClownFish() {
		super("small", "orange");
	}
	
	void jokes() {
		System.out.println("This is a joke!");
	}
}

class Dolphin extends Animal implements Swimmer {
	
}

class Butterfly extends Animal implements Flyer {
	String form = "Caterpillar";
	boolean canFly = false;
	boolean canWalk = true;
	
	void transform() {
		this.form = "Butterfly";
		this.canFly = true;
		this.canWalk = false;
	}
	
	@Override
	public void fly() {
		if(!canFly) {
			try {
				throw new Exception(form + " cannot fly!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		} else {
			System.out.println("I am flying!");
		}
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
		
		Fish fish = new Fish();
		fish.walk();
		fish.swim();
		
		Shark shark = new Shark();
		shark.eat(fish);
		
		ClownFish clownFish = new ClownFish();
		clownFish.jokes();
		
		Dolphin dolphin = new Dolphin();
		dolphin.swim();
		
		Butterfly butterfly = new Butterfly();
		butterfly.fly();
		
		butterfly.transform();
		butterfly.fly();
		butterfly.walk();
	}
}
