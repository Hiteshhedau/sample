package com.main;

public class QueueByArray {
	static class Queue {
		static int arr[];
		static int rear = -1;
		static int size;

		public Queue(int n) {
			arr = new int[n];
			this.size = n;
		}

		public static boolean isEmpty() {
			return rear == -1;
		}
		// enqueue

		public static void add(int data) {
			if (rear == size - 1) {
				System.out.println("Full queue");
				return;
			}
			rear++;
			arr[rear] = data;
		}

		// dequeue:- O(n)
		public static int remove() {
			if (isEmpty()) {
				System.out.println("Empty queue");
				return -1;
			}
			int front = arr[0];
			for (int i = 0; i < rear; i++) {
				arr[i] = arr[i + 1];
			}
			rear--;
			return front;
		}
		// peek

		public static int peek() {
			
			if (isEmpty()) {
				System.out.println("Empty queue");
				return -1;
			}
			
			return  arr[0];

		}
		

		

	}
}
