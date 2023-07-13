package com.personetics.test;

import java.util.ArrayList;
import java.util.List;

public class ChainValidator {
	
	public static boolean validate(List<Node> nodes) {
		
		//Check if the loaded list has items
		if(nodes.isEmpty()) {
			return false;
		}
		
		//Separating the original list into two lists, one with single characters
		//and another with multiple characters
		List<Character> single = new ArrayList<>();
		List<String> multiple = new ArrayList<>();
		
		nodes.stream().forEach(n -> {
			String string = n.getValue().toString();
			if(string.chars().count()==1L) {
				single.add(string.charAt(0));
			}
			else {
				multiple.add(string);
			}
		});
				
		//Checking if all the characters in the multiple list are present
		//in the single list
		List<Character> missing = new ArrayList<>();
		for(String s : multiple) {
			for (Character c : s.toCharArray()) {
				if(!single.contains(c)) {
					missing.add(c);
				}
			}
		}
		
		//Positive response if there are no missing characters
		if(missing.isEmpty()) {
			return true;
		}

		//Default response
		return false;
	}

}
