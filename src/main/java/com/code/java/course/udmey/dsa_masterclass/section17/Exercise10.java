package com.code.java.course.udmey.dsa_masterclass.section17;



/**
 * @author biswass7
 *
 *capitalizeWord
 * Implement a function that capitalizes each word in String.
 *
 * Example
 *
 * input: i love java
 * output : I Love Java

 */
public class Exercise10 {
	public static void main(String[] args) {
		System.out.println(capitalizeWord("i love java"));
	}

	private static String capitalizeWord(String str){
		if(str.isEmpty() || str=="null")
			return str;
		char c = str.charAt(str.length()-1);
		if(str.length()==1)
			return Character.toString(Character.toUpperCase(c));
		if(str.substring(str.length()-2,str.length()-1).equals(" "))
			c = Character.toUpperCase(c);
		return capitalizeWord(str.substring(0,str.length()-1))+Character.toString(c);
	}
}
