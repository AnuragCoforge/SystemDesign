package com.mario.one;

public class StarPowerUp extends CharacterDecorator{

	public StarPowerUp(ICharacter c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAbilities() {
		// TODO Auto-generated method stub
		return character.getAbilities() + " with invincibility";
	}

}
