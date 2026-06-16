package com.mario.one;

public class HeightUp extends CharacterDecorator{

	public HeightUp(ICharacter c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAbilities() {
		// TODO Auto-generated method stub
		return character.getAbilities() + " with HeightUp";
	}

}
