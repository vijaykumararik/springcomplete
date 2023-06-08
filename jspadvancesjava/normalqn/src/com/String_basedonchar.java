package com;

public class String_basedonchar {
public static void main(String[] args) {
	String s="hello"; int k=4;
	for (int i = 0; i+k <= s.length(); i++) {
		
			String s1=s.substring(i,i+k);
			System.out.println(s1);
		
	}
}
}
