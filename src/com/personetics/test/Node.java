package com.personetics.test;

public class Node {
	
	private Object value;
	
	public Node(Object value) {
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return this.getValue().toString();
	}
}
