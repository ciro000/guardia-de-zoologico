package com.zookeper.types;
import com.zookeper.types.animals.Bat;

public class BatTest {

	public static void main(String[] args) {

		Bat Noah = new Bat(300);
		
		Noah.displayEnergy();
		Noah.attackTown();
		Noah.attackTown();
		Noah.attackTown();
		Noah.displayEnergy();
		Noah.eatHumans();
		Noah.eatHumans();
		Noah.displayEnergy();
		Noah.fly();
		Noah.fly();
		Noah.displayEnergy();
	}

}
