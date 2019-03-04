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

public class Main {
	public static void main(String[] args) {
		LinkedListSolver solver = new LinkedListSolver();
		/* Generate the original list and print it*/
		Node originalList = solver.generateInitialLinkedList();
		solver.printLinkedList(originalList);
		
		/* This is the merged list */
		Node mergedList = solver.createCopyAndMerge(originalList);
		System.out.println("Merged list is");		
		solver.printLinkedList(mergedList);
		
		/* Detach the duplicate one from original one */
		Node duplicateListHead = solver.detachDuplicateListFrom(originalList);
		System.out.println("After separation, the original list is :");
		solver.printLinkedList(originalList);
		
		System.out.println("After separation, duplicate list is");
		solver.printLinkedList(duplicateListHead);

	}
}
