package com.problems.course.udmey.java_dsa_masterclass.section4;

/**
 * @author biswass7
 * 
 * power
 * 
 * Write a function called power which accepts a base and an exponent.
 * The function should return the power of the base to the exponent.
 * This function should mimic the functionality of math.pow() - do not worry about negative bases and exponents.
 * 
 * Examples:
 * 
 * power(2,0) // 1
 * power(2,2) // 4
 * power(2,4) // 16
 * 
 *
 */
public class Exercise1 {
	public static void main(String[] args) {
		System.out.println(power(4, 3));
	}
	public static int power(int base,int exponent) {
		if(exponent==0) {
			return 1;
		}
		return base*power(base,exponent-1);
	}
}
