package com.kodnest.datastructure.array.implement;

import java.util.Scanner;

public class CircularQueueApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter CircularQueue size");
	int n=scan.nextInt();
	CircularQueue circularqueue=new CircularQueue(n);
	while(true) {
		System.out.println("press 1===>insert");
		System.out.println("press 2===>delete");
		System.out.println("press 3===>display");
		System.out.println("press any key===>stop");
		System.out.println("enter your choise");
		int choise=scan.nextInt();
		switch(choise) {
		case 1: 
			circularqueue.insert();
			break;
		case 2:
			circularqueue.delete();
			break;
		case 3:
			circularqueue.didplay();
			break;
			default :
				System.exit(0);
				
		}
	}
}
}
