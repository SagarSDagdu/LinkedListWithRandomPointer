/*
Copyright (c) 2019 Sagar Dagdu <shags032@gmail.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE. */

package com.linkedlist.randompointer;

public class LinkedListSolver {
	
	/**
	 * Generates a sample LinkedList which is used to example purpose to solve this question.
	 */
	public Node generateInitialLinkedList() {
		/* Create nodes */
		Node firstNode = new Node(1, "First");
		Node secondNode = new Node(2, "Second");
		Node thirdNode = new Node(3, "Third");
		Node fourthNode = new Node(4, "Fourth");
		
		/* Set next nodes */
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		thirdNode.setNext(fourthNode);
		fourthNode.setNext(null);
		
		/* Set random nodes */
		firstNode.setRandom(thirdNode);
		secondNode.setRandom(firstNode);
		thirdNode.setRandom(thirdNode);
		fourthNode.setRandom(secondNode);
		
		return firstNode;
	}
	
	/**
	 * Creates a duplicate list and merges it with the original one.
	 * @param head
	 * @return
	 */
	public Node createCopyAndMerge(Node head) {
		Node start = head;

		/*Create nodes with data copied from the original and insert them in between of the original nodes*/
		while(start != null) {
			Node copyNode = new Node(start.getData(), start.getDescription()+ " copied");
			copyNode.setNext(start.getNext());
			start.setNext(copyNode);
			
			start = start.getNext().getNext();
		}
		
		/* Set random of the newly created nodes */
		start = head;
		while(start != null) {
			start.getNext().setRandom(start.getRandom().getNext());
			start = start.getNext().getNext();
		}
		
		return head;
	}
	
	/**
	 * Detaches the newly created duplicate linked list from the original one, and restores the pointers of
	 * original list
	 * @param originalListHead
	 * @return
	 */
	public Node detachDuplicateListFrom(Node originalListHead) {
		/* Detach the newly created duplicate linked list from the original one, 
		 * and also restore the state of original one to its original form */
		Node start = originalListHead;
		Node copiedListHead = start.getNext();
		
		while(start != null) {
			Node oldNext = start.getNext();
			start.setNext(start.getNext().getNext());
			if (oldNext.getNext() != null) {
				oldNext.setNext(oldNext.getNext().getNext());
			}
			start = start.getNext();
		}
		
		return copiedListHead;
	}
	
	/**
	 * Prints a list beginning from head
	 * @param head
	 */
	public void printLinkedList(Node head) {
		Node start = head;
		
		while(start != null) {
			String nextDescription = start.getNext() == null ? "null" : start.getNext().getDescription();
			String randomDescription = start.getRandom() == null ? "null" : start.getRandom().getDescription();
			
			System.out.println("Node : "+start.getDescription()+" ---> Next = "+ nextDescription
					+", " +start.getDescription()+ " ---> Random = "+randomDescription);
			start = start.getNext();
		}
		
		System.out.println();
	}
}
