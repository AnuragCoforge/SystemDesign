package com.mario.one;

public abstract class CharacterDecorator extends ICharacter{
	protected ICharacter character; //wrapped component
	
	public CharacterDecorator(ICharacter c) {
		this.character = c;
	}
}
