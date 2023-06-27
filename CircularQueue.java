package com.kodnest.datastructure.array.implement;

import java.util.Scanner;

public class CircularQueue {
private int cq[];
private int size;
private int r=-1;
private int f=0;
private int count=0;
private Scanner scan=new Scanner(System.in);
public CircularQueue(int n) {
	cq=new int[n];
	size=cq.length;
}
public void insert() {
	if(count==size) {
		System.out.println("insert not possible");
	}
	else {
		System.out.println("enter an element");
		int elem=scan.nextInt();
		r=(r+1)%size;
		cq[r]=elem;
		count++;
	}
}
public void delete() {
	if(count==0) {
		System.out.println("deletion is not possible");
	}
	else {
	System.out.println("deleted element is : "+cq[f]);
	f=(f+1)%size;
	count--;
	}
}
public void didplay() {
	int f1=f;
	if(count==0) {
		System.out.println("displaying not possible");
		
	}
	else {
		for(int i=1;i<=count;i++) {
			System.out.print(cq[f1]+" ");
			f1=(f1+1)%size;
		}
		System.out.println();
	}
}
}
