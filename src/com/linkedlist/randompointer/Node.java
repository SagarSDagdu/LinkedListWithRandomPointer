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

public class Node {
	private int data;
	private Node next;
	private Node random;
	private String description;
	
	public Node(int data, String description) {
		super();
		this.data = data;
		this.description = description;
	}
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	/**
	 * @return the random
	 */
	public Node getRandom() {
		return random;
	}
	/**
	 * @param random the random to set
	 */
	public void setRandom(Node random) {
		this.random = random;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
