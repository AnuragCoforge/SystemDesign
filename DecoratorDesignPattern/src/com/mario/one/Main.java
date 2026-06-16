package com.mario.one;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICharacter mario = new Mario();
		System.out.println("Basic Character: " + mario.getAbilities());
		
		//decorator Mario with a height up power-up
		mario = new HeightUp(mario);
		System.out.println("After Height Up: "+ mario.getAbilities());
		
		//Decorate Mario further with GunPowerUp
		mario = new GunPowerUp(mario);
		System.out.println("After Gun Power Up: "+ mario.getAbilities());
		
		mario = new StarPowerUp(mario);
		System.out.println("After Star Power Up: " + mario.getAbilities());
	}
}
