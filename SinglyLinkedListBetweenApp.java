package com.kodnest.datastructure.array.implement;

import java.util.Scanner;

public class SinglyLinkedListBetweenApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	SinglyLinkedListBetween sllb=new SinglyLinkedListBetween();
	while(true) {
		System.out.println("enter 1 insertrear");
		System.out.println("enter 2 display");
		System.out.println("enter 3 between");
		System.out.println("enter 4 delete rendomly");
		System.out.println("enter any other key to stop");
		System.out.println("enter your choice");
		int choice=scan.nextInt();
		switch(choice) {
		case 1 :
			sllb.insertrear();
			break;
		case 2 :
			sllb.display();
			break;
		case 3 :
			sllb.insertbetween();
			break;
		case 4 :
			sllb.deleterendom();
			break;
		default : 
			System.exit(0);
		}
	}
}
}
