package com.problems.course.udmey.dsa_masterclass.section18;
/**
 * @author biswass7
 * @) calculate GCD(greatest common division )of two numbers using recursion
 * 
 * url: https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/lecture/23273334#notes
 */

public class _3gcd {
	public static void main(String[] args) {
		_3gcd g=new _3gcd();
		var result=g.gcd(162,12);
		System.out.println(result);
	}

	private int gcd(int a, int b) {
		if(a<0 || b<0)
			return -1;
		if(b==0)
			return a;
		return gcd(b, a % b);
	}
}
