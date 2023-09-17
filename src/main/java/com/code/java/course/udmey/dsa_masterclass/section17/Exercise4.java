package com.code.java.course.udmey.dsa_masterclass.section17;



/**
 * @author biswass7
 *
 *recursiveRange
Write a function called recursiveRange which accepts a number and adds 
up all the numbers from 0 to the number passed to the function.

Examples

recursiveRange(6)  // 21
recursiveRange(10) // 55 
 */
public class Exercise4 {
	public static void main(String[] args) {
		System.out.println(recursiveRange(4));
	}

	private static int recursiveRange(int n) {
		if(n==0)
			return 0;
		return n+recursiveRange(n-1);
	}
}
