package com.main;

import java.util.Scanner;

import com.main.QueueByArray.Queue;
import com.main.StackClass.Stack;

public class MainClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the choice ");
		System.out.println("1.Stack");
		System.out.println("2.Queue");
		System.out.println("3.LinkedList");

		switch (sc.nextInt()) {
		case 1:
			do {
				System.out.println("You are in Stack");
				System.out.println("Please enter the one of the following input which you want to perform");
				System.out.println("1.Push");
				System.out.println("2.Pop");
				System.out.println("3.Peek");
				Stack st = new Stack();
				Scanner sc2 = new Scanner(System.in);
				switch (sc2.nextInt()) {
				case 1:
					Scanner sc5 = new Scanner(System.in);
					System.out.println("Enter the value which you want to push the value into the Stack");
					st.push(sc5.nextInt());
					System.out.println(" value has been push into the Stack");
					break;
				case 2:
					System.out.println("you are in pop");
					System.out.println(st.pop());
					System.out.println(" value has been pop from the Stack");
					break;
				case 3:
					System.out.println("you are in peek");
					System.out.println(st.peek());
					System.out.println(" value has been peek from the Stack");
					break;
				default:
					System.out.println("Invalid Input");
				}
				System.out.println("Do you want to continue..... please enter 1");
			} while (sc.nextInt() == 1);
			break;

		case 2:
			do {
				System.out.println("You are in Queue");
				System.out.println("Please enter the one of the following input which you want to perform");
				System.out.println("1.add");
				System.out.println("2.remove");
				System.out.println("3.peek");

				Queue qu = new Queue(5);
				Scanner sc3 = new Scanner(System.in);
				switch (sc3.nextInt()) {
				case 1:
					Scanner sc6 = new Scanner(System.in);
					System.out.println("How many times you want to enter the data into the queue");
					int n = sc6.nextInt();
					for (int i = 0; i < n; i++) {
						System.out.println("Please enter the data for the index of " + i);
						Scanner sc7 = new Scanner(System.in);
						qu.add(sc7.nextInt());
					}

					break;

				case 2:
					System.out.println("you are in remove");
					System.out.println(qu.remove());
					break;
				case 3:
					System.out.println("you are in peek");
					System.out.println(qu.peek());

					break;
				}

				System.out.println("Do you want to continue...please enter 1");
			} while (sc.nextInt() == 1);
			break;
		case 3:

			do {

				System.out.println("You are in LinkedList");
				System.out.println("please enter the following code which you want to perform the operation");
				System.out.println("a==>addFirst");
				System.out.println("b==>addLast");
				System.out.println("c==>deleteFirst");
				System.out.println("d==>deleteLast");
				System.out.println("e==>getSize");
				System.out.println("f==>printList");
				LL list = new LL();
				Scanner sc4 = new Scanner(System.in);
				switch (sc4.next()) {
				case "a":
					System.out.println("addFirst");
					list.addFirst(sc4.next());
					break;
				case "b":
					System.out.println("addLast");
					list.addLast(sc4.next());
					break;
				case "c":
					System.out.println("deleteFirst");
					list.deleteFirst();
					break;
				case "d":
					System.out.println("deleteLast");
					list.deleteLast();
					break;

				case "e":
					System.out.println("getSize");
					list.getSize();
					break;
				case "f":
					System.out.println("printList");
					list.printList();
					break;
				default:
					System.out.println("Invalid Input");
				}
				System.out.println("Do you want to continue.... please enter 1");
			}

			while (sc.nextInt() == 1);
			break;
		default:
			System.out.println("Invalid Input");
		}

	}
}
