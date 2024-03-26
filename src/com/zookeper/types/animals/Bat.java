package com.zookeper.types.animals;
import com.zookeper.types.Mammal;

public class Bat extends Mammal {
	
	public Bat(int energyLevel){
		super(energyLevel);
	}
	
	public void fly() {
		System.out.println("Slash slash slash");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("bueno, no importa");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("BWOWOFOHSHHH AAWHUHUGRJKSAM AAA");
		energyLevel -= 100;
	}
}
