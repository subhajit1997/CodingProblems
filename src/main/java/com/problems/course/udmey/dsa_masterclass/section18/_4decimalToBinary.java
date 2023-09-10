package com.problems.course.udmey.dsa_masterclass.section18;

/**
 * @author biswass7
 * @) convert a number from decimal to binary using recursion
 * 
 * url: https://relxlearning.udemy.com/course/java-data-structures-and-algorithms-masterclass/learn/lecture/23281558#notes
 */

public class _4decimalToBinary {

	public static void main(String[] args) {
		_4decimalToBinary dtB= new _4decimalToBinary();
		var result=dtB.binaryConvert(13);
		System.out.println(result);

	}

	private int binaryConvert(int n) {
		if(n==0)
			return 0;
		return n%2+10*binaryConvert(n/2); 
		
	}

}
