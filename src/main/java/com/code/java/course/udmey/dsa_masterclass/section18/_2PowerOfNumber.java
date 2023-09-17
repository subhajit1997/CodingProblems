package com.code.java.course.udmey.dsa_masterclass.section18;

/**
 * @author biswass7
 * @) How to calculate power of a number using recursion
 * 
 * url: https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/lecture/23272228#notes
 */

public class _2PowerOfNumber {

	public static void main(String[] args) {
		_2PowerOfNumber p =new _2PowerOfNumber();
		var result=p.power(4,5);
		System.out.println(result);

	}

	private int power(int base, int exp) {
		if(exp<0)
			return -1;
		if(exp==0)
			return 1;
		return base* power(base, exp-1);
		
	}

}
