package com.problems.course.udmey.java_dsa_masterclass;



/**
 * @author biswass7
 * @) How to Find the sum of digits of a positive integers using recursion
 * https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/lecture/23271334#notes
 */
public class _1SumOfDigits {
	public static void main(String[] args) {
		_1SumOfDigits sum =new _1SumOfDigits();
		var result=sum.sumOfDigts(189);
		System.out.println(result);
	}
	public int sumOfDigts(int n) {
		if(n==0 || n<0)
			return 0;
		return n%10+sumOfDigts(n/10);
	}
}
