package com.problems.course.udmey.java_dsa_masterclass.section4;



/**
 * @author biswass7
 *
 *someRecursive
Write a recursive function called someRecursive which accepts an array and a callback. The function returns true if a single value in the array returns true when passed to the callback. Otherwise it returns false.

Examples

someRecursive({1,2,3,4}, isOdd) # true
someRecursive({4,6,8,9}, isOdd) # true
someRecursive({4,6,8}, isOdd) # false

 */
public class Exercise7 {
	public static void main(String[] args) {
		OddFunction odd = new OddFunction();
		System.out.println(someRecursive(new int[] {1,2,3,4},odd));
	}

	private static boolean someRecursive(int[] arr, OddFunction odd) {
		// TODO Auto-generated method stub
		return true;
	}

	
}
class OddFunction {
    boolean run(int num) {
        if (num % 2 == 0) { 
            return false; }
       else {
           return true;
       }
    }
  }