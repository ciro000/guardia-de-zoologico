package com.zookeper.types.animals;

import com.zookeper.types.Mammal;

public class Gorilla extends Mammal {
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething() {
		System.out.println("El gorila ha lanzado algo");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("El gorila está satisfecho");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("El gorila ha trepado a la cima de un árbol");
		energyLevel -= 10;
	}

}
