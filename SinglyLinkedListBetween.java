package com.kodnest.datastructure.array.implement;

import java.util.Scanner;

public class SinglyLinkedListBetween {
	class Node {
		int data;
		Node link;
	}

	Node first;
	Scanner scan = new Scanner(System.in);

	public void insertrear() {
		System.out.println("enter element");
		int elem = scan.nextInt();
		Node newnode = new Node();
		newnode.data = elem;
		newnode.link = null;
		if (first == null) {
			//System.out.println("inserted 1st element is : " + elem);
			first = newnode;
		} else {
			Node temp;
			temp = first;
			while(temp.link!=null) {
				temp=temp.link;
			}
			temp.link=newnode;
			//temp=newnode;
		}
	}

	void display() {
		if (first == null) {
			System.out.println("display not possible");
		} else {
			Node temp;
			temp = first;
			while (temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.link;
			}
			System.out.println();
		}
	}

	void insertbetween() {
		System.out.println("enter element");
		int elem = scan.nextInt();
		Node newnode = new Node();
		System.out.println("enter position");
		int pos=scan.nextInt();
		newnode.data = elem;
		newnode.link = null;
		if (first == null) {
			System.out.println("inserted 1st element is : " + elem);
			first = newnode;
		} 
		
		else {
			Node temp;
			temp = first;
			for(int i=1; i<(pos-1)&&temp!=null;i++)
			{
				temp=temp.link;
			}
			newnode.link=temp.link;
			temp.link=newnode;
		}
	}
	public void deleterendom()
	{
		if(first==null)
		{
			System.out.println("deletion not posible");
		}
		else if(first.link==null)
		{
			System.out.println("element deleted is "+first.data);
			first=null;
		}
		else
		{
			Node temp;
			temp=first;
			System.out.println("enter delete position");
			int pos=scan.nextInt();
					
			for(int i=1; i<(pos-1)&&temp.link!=null; i++)
			{
				temp=temp.link;
			}
			temp.link=temp.link.link;
			
		}
	}
}
