package com.revature.app;

public class Driver {

	public static void main(String[] args) {
		myPet ron = new myPet();
		
		ron.type="Jump";
		ron.size="big";
		
		System.out.println("my dog likes to " + ron.type);
		
		ron.type("big");
		ron.type("border collie");
		
		

	}

}
