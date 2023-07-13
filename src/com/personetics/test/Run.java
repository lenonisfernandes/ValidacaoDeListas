package com.personetics.test;

import java.util.ArrayList;
import java.util.List;

public class Run {
	
	public static void main(String[] args) {
		List<Node> nodes = new ArrayList<Node>();
		nodes.add(new Node(27));
		nodes.add(new Node(3));
		nodes.add(new Node(2));
		nodes.add(new Node(7));
		nodes.add(new Node(47));
		nodes.add(new Node(4));
		nodes.add(new Node(24));
		nodes.add(new Node(6));
		nodes.add(new Node(36));
		
		System.out.println(nodes);
		System.out.println(ChainValidator.validate(nodes));
		System.out.println("");
		
		List<Node> nodes2 = new ArrayList<Node>();
		nodes2.add(new Node("p"));
		nodes2.add(new Node("aba"));
		nodes2.add(new Node("a"));
		nodes2.add(new Node("b"));
		nodes2.add(new Node("perso"));
		nodes2.add(new Node("o"));
		nodes2.add(new Node("r"));
		nodes2.add(new Node("e"));
		nodes2.add(new Node("s"));

		System.out.println(nodes2);
		System.out.println(ChainValidator.validate(nodes2));
		System.out.println("");
		
		List<Node> nodes3 = new ArrayList<Node>();
		nodes3.add(new Node(4));
		nodes3.add(new Node(24));
		nodes3.add(new Node(6));
		nodes3.add(new Node(65));
		nodes3.add(new Node(5));
		nodes3.add(new Node(32));

		System.out.println(nodes3);
		System.out.println(ChainValidator.validate(nodes3));
		System.out.println("");


	}

}
