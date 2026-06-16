package com.mario.one;

public class GunPowerUp extends CharacterDecorator{

	public GunPowerUp(ICharacter c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAbilities() {
		// TODO Auto-generated method stub
		return character.getAbilities() + " with Gun Power";
	}

}
