package com.kodnest.datastructure.array.implement;

import java.util.Scanner;

public class LinkedListApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	LinkedList ll=new LinkedList();
	while(true) {
		System.out.println("press 1===insertrear");
		System.out.println("press 2===deleterear");
		System.out.println("press 3===insertfront");
		System.out.println("press 4===deletefront");
		System.out.println("press 5===display");
		System.out.println("press 6===insertbetween");
		System.out.println("press any key===stop");
		System.out.println("enter your choise");
		int choise=scan.nextInt();
		switch(choise) {
		case 1:
			ll.insertrear();
			break;
		case 2:
			ll.deleterear();
			break;
		case 3:
			ll.insertfront();
			break;
		case 4:
			ll.deletefront();
			break;
		case 5:
			ll.display();
			break;
		case 6:
			ll.insertbetween();
			break;
			default :
				System.exit(0);
		}
	}
}
}
