package com.kodnest.datastructure.array.implement;

import java.util.Scanner;

public class LinkedList {
public class Node{
	int data;
	Node link;
}
private Node first;
private Scanner scan=new Scanner(System.in);
public void insertrear() {
	Node temp;
	System.out.println("enter an element");
	int elem=scan.nextInt();
	Node newnode=new Node();
	newnode.data=elem;
	newnode.link=null;
	if(first==null)
	{
		first=newnode;
	}
	else
	{
		temp=first;
		while(temp.link!=null) {
		temp=temp.link;	
		}
		temp.link=newnode;
	}
}
public void deleterear() {
	Node temp;
	if(first==null) {
		System.out.println("deletion not possible");
	}
	else if(first.link==null) {
		System.out.println("deleted element is : "+first.data);
		first=null;
	}
	else {
		temp=first;
		while(temp.link.link!=null) {
			temp=temp.link;
		}
		System.out.println("element deleted is : "+temp.link.data);
		temp.link=null;
	}
}
public void insertfront() {
	System.out.println("enter an element");
	int elem=scan.nextInt();
	Node newnode=new Node();
	newnode.data=elem;
	newnode.link=null;
	if(first==null) {
		first=newnode;
	}
	else {
		newnode.link=first;
		first=newnode;
	} 
}
public void deletefront() {
	if(first==null) {
		System.out.println("deletion not possible");
	}
	else if(first.link==null) {
		System.out.println("deleted element is : "+first.data);
		first=null;
	}
	else {
		first=first.link;
	}
}
public void insertbetween() {
	Node temp;
	Node count;
	
	if(first==null||first.link==null) {
		System.out.println("insertbetween not possible");
	}
	else
	{
		temp=first;
		count=temp;
	System.out.println("enter an element");
	int elem=scan.nextInt();
	Node newnode=new Node();
	//key for insertion
		System.out.println("enter position");
		int pos=scan.nextInt();
	newnode.data=elem;
	newnode.link=null;
	
	//link=pos;
	while(temp.data==pos) {
		while(count==temp.link) {
			if(first==null) {
				System.out.println("Insertion not possible");
			}
			else if(first.link==null) {
				System.out.println("Inserted element is : "+first.data);
				first=newnode;
			}
			else {
				temp=first;
				while(temp.link.link!=null) {
					temp=temp.link;
				}
				System.out.println("element deleted is : "+temp.link.data);
				temp.link=null;
			}
		}
		
	}
	}
	
}
public void display() {
	Node temp;
	if(first==null) {
		System.out.println("display not possible");
	}
	else if(first.link==null) {
		System.out.println(first.data+" ");
	}
	else {
	temp=first;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.link;
	}
	System.out.println();
}
}
}
