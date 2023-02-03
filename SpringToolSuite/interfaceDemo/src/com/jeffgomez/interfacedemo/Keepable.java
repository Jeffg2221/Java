package com.jeffgomez.interfacedemo;

public interface Keepable {
	//default means usable
	public default void play() {
		System.out.println("Playing.....");
	}
	// abstract means it has to be completed  when the interface is implemented
	abstract void showAffection();
	abstract void askForFood();
}
