package com.problems.course.udmey.dsa_masterclass.section17;



/**
 * @author biswass7
 *
 *First Uppercase
 * Given a string find its first uppercase letter
 *
 * Example
 *
 * Input : appmillerS
 * Output : S

 */
public class Exercise9 {
	public static void main(String[] args) {
		System.out.println(first("appmillerS"));
	}

	private static char first(String str) {
		if(str.isEmpty() || str=="null")
			return ' ';
		char firstChar = str.charAt(0);
		if(Character.isUpperCase(firstChar))
			return firstChar;
		else
			return first(str.substring(1,str.length()));
	}
}
