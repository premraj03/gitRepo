package com.kodnest.datastructure.array.implement;

import java.util.Scanner;

public class DublyLinkedListApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	DublyLinkedList dll=new DublyLinkedList();
	while(true) {
		System.out.println("press 1===>insetfront");
		System.out.println("press 2===>insetrear");
		System.out.println("press 3===>deletefront");
		System.out.println("press 4===>deleterare");
		System.out.println("press 5===>displayforward");
		System.out.println("press 6===>displayreversed");
		System.out.println("press any key===>stop");
		System.out.println("enter your choise");
		int choise=scan.nextInt();
		switch(choise) {
		case 1:
			dll.inserfront();
			break;
		case 2:
			dll.insertrear();
			break;
		case 3:
			dll.deletefront();
			break;
		case 4:
			dll.deleterear();
			break;
		case 5:
			dll.displayforward();
			break;
		case 6:
			dll.displayreversed();
			break;
			default :
				System.exit(0);
		}
	}
}
}
