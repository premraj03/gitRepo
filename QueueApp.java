package com.kodnest.datastructure.array.implement;

import java.util.Scanner;

public class QueueApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter queue size");
	int n=scan.nextInt();
	Queue queue=new Queue(n);
	while(true) {
		System.out.println("press 1===>insert");
		System.out.println("press 2===>delete");
		System.out.println("press 3===>display");
		System.out.println("enter any no to stop");
		System.out.println("enter your choise");
		int choise=scan.nextInt();
		switch(choise) {
		case 1:
			queue.insert();
			break;
		case 2:
			queue.delete();
			break;
		case 3:
			queue.disply();
			break;
			default :
				System.exit(0);
		}
	}
}
}
