package com.code.java.practice.leetcode.randomSolution;

/*
1720. Decode XORed Array

https://leetcode.com/problems/decode-xored-array/

There is a hidden integer array arr that consists of n non-negative integers.

It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].

You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].

Return the original array arr. It can be proved that the answer exists and is unique.

 

Example 1:

Input: encoded = [1,2,3], first = 1
Output: [1,0,2,1]
Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
Example 2:

Input: encoded = [6,2,7,3], first = 4
Output: [4,2,0,7,4]

 */

public class Solution1720 {
	public static void main(String[] args) {
		Solution1720 solution=new Solution1720();
		int[] n={1,2,3};
		int[] ans=solution.decode(n,1);
		for(int i:ans)
		{
			System.out.print(i+" ");
		}
	}

	public int[] decode(int[] encoded, int first) {
        int[] decoded=new int[encoded.length+1];
        int count=0;
        decoded[0]=first;
        for(int i=0;i<encoded.length;i++)
        {
            for(int j=0;j<999999;j++)
            {
                if((first^j)==encoded[i])
                {
                    first=j;
                    break;
                }  
            }
            count++;
            decoded[count]=first;
        }
        return decoded;
    }
}