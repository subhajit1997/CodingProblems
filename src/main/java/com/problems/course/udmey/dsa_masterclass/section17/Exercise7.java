package com.problems.course.udmey.dsa_masterclass.section17;



/**
 * @author biswass7
 *
 *isPalindrome
Write a recursive function called isPalindrome which returns true if the string passed to it is a palindrome (reads the same forward and backward). Otherwise it returns false.

Examples

isPalindrome('awesome') # false
isPalindrome('foobar') # false
isPalindrome('tacocat') # true
isPalindrome('amanaplanacanalpanama') # true
isPalindrome('amanaplanacanalpandemonium') # false

 */
public class Exercise7 {
	public static void main(String[] args) {
		System.out.println(isPalindrome("amanaplanacanalpanama"));
	}

	private static boolean isPalindrome(String str) {
		
		if(str.isEmpty()|| str=="null")
			return true;
		if(str.length()==0 || str.length()==1)
			return true;
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			return isPalindrome(str.substring(1, str.length()-1));
		}
		return false;
	}
}
