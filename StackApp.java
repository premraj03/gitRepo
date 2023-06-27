package com.kodnest.datastructure.array.implement;

import java.util.Scanner;

public class StackApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter Stack Size");
	int n=scan.nextInt();
	Stack stack=new Stack(n);
	while(true) {
	System.out.println("press 1.......>push ");
	System.out.println("press 2........>pop ");
	System.out.println("press 3........>display");
	System.out.println("press any key to exit");
	System.out.println("enter your choise");
	int choise=scan.nextInt();
	switch(choise) {
	case 1: 
		stack.push();
	    break;
	case 2 :
		stack.pop();
		break;
	case 3:
		stack.didplay();
		break;
	default :
			System.exit(0);
	}
	}
}
}
