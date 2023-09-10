package com.problems.course.striver.A2ZDSA.Step3.Step3_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** <IMPORTANT>
 * learn:https://takeuforward.org/data-structure/majority-elementsn-3-times-find-the-elements-that-appears-more-than-n-3-times-in-the-array/
 * practice:https://leetcode.com/problems/majority-element-ii/description/
 *
 */
public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{11, 33, 33, 11, 33, 11}).toString());
        System.out.println(majorityElementOptimised(new int[]{11, 33, 33, 11, 33, 11}).toString());
        System.out.println(majorityElementBestApproach(new int[]{11, 33, 33, 11, 33, 11}).toString());


    }
    public static  List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int check = n/3;
        List<Integer> val = new ArrayList<>();
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=i;j<n;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count >check && !val.contains(nums[i]))
                val.add(nums[i]);
        }
        return val;
    }
    //O(NLog(N))
    // Insertion in hash map takes Log(N)

    public static List<Integer> majorityElementOptimised(int[] nums) {
        int n = nums.length;
        int check = n/3+1;
        List<Integer> val = new ArrayList<>();
        HashMap<Integer,Integer> hash= new HashMap<>();
        for(int i=0;i<n;i++){
            int value = hash.getOrDefault(nums[i],0);
            hash.put(nums[i],value+1);

            if(hash.get(nums[i])==check)
                val.add(nums[i]);
        }
        return val;
    }

    //Extended Boyer Moore's Voting Algorithm
    //O(N)
    public static List<Integer> majorityElementBestApproach(int []v) {
        int n = v.length; //size of the array

        int cnt1 = 0, cnt2 = 0; // counts
        int el1 = Integer.MIN_VALUE; // element 1
        int el2 = Integer.MIN_VALUE; // element 2

        // applying the Extended Boyer Moore's Voting Algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && el2 != v[i]) {
                cnt1 = 1;
                el1 = v[i];
            } else if (cnt2 == 0 && el1 != v[i]) {
                cnt2 = 1;
                el2 = v[i];
            } else if (v[i] == el1) cnt1++;
            else if (v[i] == el2) cnt2++;
            else {
                cnt1--; cnt2--;
            }
        }

        List<Integer> ls = new ArrayList<>(); // list of answers

        // Manually check if the stored elements in
        // el1 and el2 are the majority elements:
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el1) cnt1++;
            if (v[i] == el2) cnt2++;
        }

        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);

        // Uncomment the following line
        // if it is told to sort the answer array:
        //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

        return ls;
    }

}
