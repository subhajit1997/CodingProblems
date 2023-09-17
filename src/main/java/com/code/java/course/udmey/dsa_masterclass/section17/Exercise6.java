package com.code.java.course.udmey.dsa_masterclass.section17;



/**
 * @author biswass7
 *
 *reverse
Write a recursive function called reverse which accepts a string and returns a new string in reverse.

Examples

reverse('java') # 'avaj'
reverse('appmillers') # 'srellimppa'
 */
public class Exercise6 {
	public static void main(String[] args) {
		System.out.println(reverse("java"));
	}

	private static String reverse(String str) {
		System.out.println(str);
		if(str.isEmpty() || str=="null")
			return str;
		return reverse(str.substring(1))+str.charAt(0);
	}
}
