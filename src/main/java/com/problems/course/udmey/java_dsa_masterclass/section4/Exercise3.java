package com.problems.course.udmey.java_dsa_masterclass.section4;

/**
 * @author biswass7
 *
 *product of Array
Write a function called productOfArray which takes in an array of 
numbers and returns the product of them all.

Examples

int arr[] = { 1, 2, 3, 4, 5 }; 
productofArray(arr, arr.length); #120
 */
public class Exercise3 {

	public static void main(String[] args) {
		System.out.println(productOfArray(new int[]{1,2,5}, 3));
	}

	private static int productOfArray(int[] arr,int N) {
		if(N==0)
			return 1;
		return arr[N-1]*productOfArray(arr, N-1);
	}
	

}
