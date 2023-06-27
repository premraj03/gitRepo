package com.kodnest.datastructure.array.implement;

import java.util.Scanner;

public class Queue {
private int q[];
private int size;
private int r=-1;
private int f=0;
private Scanner scan=new Scanner(System.in);
public Queue(int n) {
	q=new int[n];
	size=q.length;
	
}
public void insert() {
	int elem;
	if(r==size-1) {
		System.out.println("insertion not possible");
	}
	else {
		System.out.println("enter an element");
		elem=scan.nextInt();
		++r;
		q[r]=elem;
	}
}
public void delete() {
	if(r==-1||f>r) {
		System.out.println("deletion not possible");
		
	}
	else {
		System.out.println("element deleted is : "+q[f]);
		++f;
	}
}
public void disply() {
	if(r==-1||f>r) {
		System.out.println("display not possible");
		
	}
	else {
		for(int i=f;i<=r;i++) {
			System.out.print(q[i]+" ");
		}
		System.out.println();
	}
}
}
