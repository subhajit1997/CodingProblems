package LeetCode.Problems;

import java.util.ArrayList;
import java.util.List;

/*

1389. Create Target Array in the Given Order

https://leetcode.com/problems/create-target-array-in-the-given-order/

Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.

 

Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
Example 2:

Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]

 */

public class Solution1389 {
	public static void main(String[] args) {
		Solution1389 solution=new Solution1389();
		int[] n={0,1,2,3,4};
		int [] n1= {0,1,2,2,1};
		int[] ans=solution.createTargetArray(n,n1);
		for(int i:ans)
		{
			System.out.print(i+" ");
		}
	}

    public int[] createTargetArray(int[] nums, int[] index) {
        int count=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:nums)
        {
            al.add(index[count],i);
            count++;
        }
        return al.stream().mapToInt(i -> i).toArray();
    }
}