package com.code.java.course.striver.A2ZDSA.Step3_Arrays.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_Lect3 {
    public static void main(String[] args) {
        System.out.println(" Program to generate Pascal's Triangle at a row : ");
        lect3_1_elemnt_at_row(5);
        System.out.println("Find the elements that appears more than N/3 times in the array: "+lect3_2_hashmap(new int[]{11,33,33,11,33,11})+
            "\n"+lect3_2_moores_voting_algo(new int[]{11,33,33,11,33,11}));
        System.out.println("3 Sum: "+lect3_3_bruteforce(new int[]{-1,0,1,2,-1,-4})+
            "\n"+lect3_3_hashset(new int[]{-1,0,1,2,-1,-4})+
            "\n"+lect3_3_optimal_pointers(new int[]{-1,0,1,2,-1,-4}));
         System.out.println("4 Sum: "+lect3_4_bruteforce(new int[]{4, 3, 3, 4, 4, 2, 1, 2, 1, 1},9)+
            "\n"+lect3_4_better_set(new int[]{4, 3, 3, 4, 4, 2, 1, 2, 1, 1},9)+
            "\n"+lect3_4_optimal_using_pointers(new int[]{4, 3, 3, 4, 4, 2, 1, 2, 1, 1},9));
        System.out.println("Length of the longest subarray with zero Sum:  "+
            lect3_5_brute_force(new int[]{6, -2, 2, -8, 1, 7, 4, -10})+
            "\n"+lect3_5_hashMap_optimised(new int[]{6, -2, 2, -8, 1, 7, 4, -10}));
        System.out.println("Merge Overlapping Sub-intervals: "+ lect3_7_bruteforce(new int[][]{{1, 3}, {8, 10}, {2, 6}, {15, 18}})+
            "\n"+lect3_7_optimised(new int[][]{{1, 3}, {8, 10}, {2, 6}, {15, 18}}));
        System.out.println("Merge two Sorted Arrays Without Extra Space: "+Arrays.toString(lect3_8_myapproach(new int[]{1,4,8,10},new int[]{2,3,9}))+
            "\n"+lect3_8_approach1_withoutspace_using_sorting(new int[]{1,4,8,10},new int[]{2,3,9}));
        System.out.println(Arrays.toString(lect3_9_bruteforce(new int[]{3, 1, 2, 5, 4, 6, 7, 5}))+
            "\n"+Arrays.toString(lect3_9_hash(new int[]{3, 1, 2, 5, 4, 6, 7, 5})));
        System.out.println("Maximum Product Subarray in an Array: "+lect3_12_bruteforce(new int[]{1,2,-3,0,-4,-5})+
            "\n"+lect3_12_optimal_using_prefix_suffix(new int[]{1,2,-3,0,-4,-5}));
    }
    //Problem Statement : Program to generate Pascal's Triangle
    /*
     * 1
     * 11
     * 121
     * 1331
     * 14641
     */
    public static void lect3_1_elemnt_at_row(int n){
        for(int c=1;c<=n;c++){
             System.out.print(nCr(n-1,c-1)+" ");
        }
        System.out.println();
    }
    //nCr = n! / (r! * (n-r)!)
    public static long nCr(int n,int r){
        long res =1;
        for(int i=0;i<r;i++){
            res = res *(n-i);
            res = res /(i+1);
        }
        return res;
    }
    //Problem Statement :Majority Elements(&gt;N/3 times) | Find the elements that appears more than N/3 times in the array
    //max two elements can be maajority not more than 2 as N/3 = 8/3 = 2 times, If 3 elements ie 3*3 =9 which is more than size of array 8 , so 2 majority elements
    public static List<Integer> lect3_2_hashmap(int[] arr){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value+1);
        }
        for(Map.Entry<Integer,Integer> m : mpp.entrySet()){
            if(m.getValue()>n/3){
                result.add(m.getKey());
            }
        }
        return result;
    }  
    public static List<Integer> lect3_2_moores_voting_algo(int[] arr){
        int n = arr.length;
        int count1=0,count2=0;
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;

        List<Integer> result = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(count1 ==0 && element1!=arr[i]){
                count1 =1;
                element1 = arr[i];
            }else if(count2==0 && element2!=arr[i]){
                count2 = 1;
                element2 = arr[i];
            }else if(element1 == arr[i]){
                count1++;
            }else if(element2 ==arr[i])
                count2++;
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<n;i++){
            if(element1==arr[i])
                count1++;
            if(element2 == arr[i])
                count2++;
        }
        int min = (int)(n/3)+1;
        if(count1>=min)
            result.add(element1);
        if(count2>=min)
            result.add(element2);
        return result;
        
    } 
    //Problem Statement :3 Sum : Find triplets that add up to a zero
    public static List<List<Integer>> lect3_3_bruteforce(int[] arr){
        //Time: O(N3 * log(no. of unique triplets))
        //space: O(2*no fo triplets)
        Set<List<Integer>>  result = new HashSet();
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> temp =  Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(temp);
                        result.add(temp);
                    }
                }
                
            }
        }
        return new ArrayList<>(result);
    }
    public static List<List<Integer>> lect3_3_hashset(int[] arr){
        //Time: O(N3 * log(no. of unique triplets))
        //space: O(2*no fo triplets)
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            Set<Integer> hashSet = new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int thirdElement = -arr[i] -arr[j];
                if(hashSet.contains(thirdElement)){
                    List<Integer> lst =  Arrays.asList(arr[i],arr[j],thirdElement);
                    Collections.sort(lst);
                    result.add(lst);
                }
                hashSet.add(arr[j]);
            }
        }
        return new ArrayList<>(result);
    }
    public static List<List<Integer>> lect3_3_optimal_pointers(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<n;i++){
            //remove duplicates
            if(i!=0 && arr[i] == arr[i-1])
                continue;
            //moving 2 pointers
            int j=i+1;
            int k=n-1;
            while (j<k) {
                int sum = arr[i]+arr[j]+arr[k];
                if(sum<0)
                    j++;
                else if(sum>0)
                    k--;
                else{
                    List<Integer> lst = Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(lst);
                    j++;
                    k--;

                    //skip duplicvates
                    while (j<k && arr[j] == arr[j-1]) {
                        j++;
                    }
                    while (j<k && arr[k] == arr[k+1]) {
                        k--;
                    }
                }
            }
        }
        return ans;
    }   
    //Problem Statement :4 Sum : Find Quads that add up to a target value
    public static List<List<Integer>> lect3_4_bruteforce(int[] arr,int target){
        //TYime : O(N^4)
        //space: O(2 * no. of the quadruplets)
        Set<List<Integer>> ans = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l = k+1;l<n;l++){
                        long sum = arr[i]+arr[j]+arr[k]+arr[l];
                        if(sum==target){
                            List<Integer> lst = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                            Collections.sort(lst);
                            ans.add(lst);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
    public static List<List<Integer>> lect3_4_better_set(int[] arr,int target){
        //TYime : O(N^3*log(M))
        //space: O(2 * no. of the quadruplets)+O(N)
        Set<List<Integer>> ans = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Integer> hashSet = new HashSet<>();
                for(int k=j+1;k<n;k++){
                    int remaining = target - (arr[i]+arr[j]+arr[k]);
                    if(hashSet.contains(remaining)){
                        List<Integer> lst = Arrays.asList(arr[i],arr[j],arr[k],remaining);
                        Collections.sort(lst);
                        ans.add(lst);
                    }
                    hashSet.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(ans);
    }  
    public static List<List<Integer>> lect3_4_optimal_using_pointers(int[] arr,int target){
        //Time: O(N3)
        //space:  O(no. of quadruplets),
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();

        //sort the array
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            //avoid duplicates
            if(i>0 && arr[i]==arr[i-1])
                continue;
            for(int j=i+1;j<n;j++){
                //avoid duplicvates
                if(j>i+1 && arr[j]==arr[j-1])
                    continue;
                //2 pointers
                int k=j+1;
                int l = n-1;
                while (k<l) {
                    long sum = arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum<target)
                        k++;
                    else if(sum>target)
                        l--;
                    else{
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                        result.add(temp);
                        k++;
                        l--;

                        //skip duplicates
                        while (k<l && arr[k]==arr[k-1]) {
                            k++;
                        }
                        while (k<l && arr[l]==arr[l+1]) {
                            l--;
                        }
                    }
                }

            }
        }
        return result;
    } 
    //Problem Statement :Length of the longest subarray with zero Sum
    public static int lect3_5_brute_force(int[] arr){
        //Time :O(N^2)
        int longest = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            int count=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                count++;
                if(sum==0){
                    longest = Math.max(longest, count);
                }
            }
        }
        return longest;
    }
    public static int lect3_5_hashMap_optimised(int[] arr){
        //Prefix Sum + HashMap is for detecting repeated sums to find zero-sum subarrays 
        // different from kadens algo, as in kadens we track max sum , and here we need 0 sum
        //presum,index => hashmap
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int maximum=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maximum = i+1; //this means from start to current index sum is 0 so add to max
            }else{
                if(mpp.containsKey(sum)){
                    // This means we already had the sum  as key in mapp ,
                    // So if we substract curent index with older index we know sum in between curr & old index will be 0 
                    int val = mpp.get(sum);
                    maximum = Math.max(maximum, i-val ); 
                }else{
                    mpp.put(sum, i); // we insert sum,index to mapp as sum is not 0 and does not exist in mapp
                }
            }
        }
        return maximum;
    }    

    //Problem Statement :Merge Overlapping Sub-intervals
    public static List<List<Integer>> lect3_7_bruteforce(int[][]  arr){
        // time: O(N*logN) + O(2*N)
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        for(int i=0;i<n;i++){
            int start = arr[i][0];
            int end = arr[i][1];
            if(!result.isEmpty() && end <= result.get(result.size()-1).get(1)){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(arr[j][0] <= end){
                    end = Math.max(end, arr[j][1]);
                }else{
                    break;
                }
            }
            result.add(Arrays.asList(start,end));
        }
        return result;
    }
    
    public static List<List<Integer>> lect3_7_optimised(int[][]  arr){
        // time: O(N*logN) + O(N)
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
         Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        for(int i=0;i<n;i++){

            //if current interval does not lie in last interval
            if(result.isEmpty() || arr[i][0] > result.get(result.size()-1).get(1)){
                result.add(Arrays.asList(arr[i][0],arr[i][1]));
            }

            //if current index lies in last interval
            else{
                result.get(result.size()-1).set(1, Math.max(result.get(result.size()-1).get(1), arr[i][1]));
            }
        }
        return result;
    }
    //Problem Statement :Merge two Sorted Arrays Without Extra Space
    public static int[] lect3_8_myapproach(int[]  arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] res = new int[n+m];
        int i=0,j=0;
        int k=0;
        while (i<n && j<m) {
            if(arr1[i]<arr2[j]){
                res[k] = arr1[i];
                i++;
            }else if(arr1[i]>arr2[j]){
                res[k]= arr2[j];
                j++;
            }else{
                res[k]=arr1[i];
                i++;
                j++;
            }
            k++;
        }
        while (i < n) {
            res[k++] = arr1[i++];
        }

        while (j < m) {
            res[k++] = arr2[j++];
        }
        return res;
    }
    public static List<List<Integer>> lect3_8_approach1_withoutspace_using_sorting(int[]  arr1,int[] arr2){
        //Time :  O(min(n, m)) + O(n*logn) + O(m*logm)
        int n = arr1.length;
        int m = arr2.length;

        //declare two pointers
        int left= n-1;
        int right =0;
        //swap elements until arr1[left] is smaller than arr2[right]
        while (left>=0 && right<m) {
            if(arr1[left]> arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }else{
                break;
            }
        }
        
        //sort arr1 and arr2
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        List<List<Integer>> lst= new ArrayList<>();
        List<Integer> val = new ArrayList<>();
        for (int num : arr1) {
            val.add(num);
        }
        lst.add(val);
        List<Integer> val2 = new ArrayList<>();
        for (int num : arr2) {
            val2.add(num);
        }
        lst.add(val2);
        return lst;

    }
    //NOTE : Try using GAP METHOD

    //Problem Statement :Find the repeating and missing numbers
    public static int[] lect3_9_bruteforce(int[]  arr){
        //Time :O(N^2)
        int repeating =-1,missing=-1;
        int n = arr.length;
        for(int i=1;i<=n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    count++;
                }
                if(count==2)
                    repeating = i;
                else if(count ==0)
                    missing = i;
                if(repeating!=-1 && missing!=-1)
                    break;
            }
        }
        return new int[]{repeating,missing};
    }
    public static int[] lect3_9_hash(int[]  arr){
        //Time :O(N^2)
        int repeating =-1,missing=-1;
        int n = arr.length;
        int hash[] = new int[n+1];

        for(int i=0;i<n;i++){
            hash[arr[i]]++; // each array number will go based on there value to an index , for non repeating it will be 1 , for repeating will be 2 and missing 0
        }
        for(int i=1;i<=n;i++){
            if(hash[i]==2)
                repeating = i;
            else if(hash[i]==0)
                missing = i;
            if(repeating!=-1 && missing!=-1)
                break;
        }
        return new int[]{repeating,missing};
    }
    //Problem Statement :Maximum Product Subarray in an Array
    public static int lect3_12_bruteforce(int[]  arr){
        int maxProduct = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int product = 1;
            for(int j=i+1;j<arr.length;j++){
                product *=arr[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }
    public static int lect3_12_optimal_using_prefix_suffix(int[]  arr){
        //Idea is if even -1 is there in a subarray its the max
        //if odd -1 is there thats the it will result in final negative number , So if we remove one negative number then overall its positive
        //we notice that each chosen negative number divides the array into two parts pre and suff
        int n = arr.length;
        int pre=1,suff=1;
        int result = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            //Ignore 0 as that causes 0 if multiuplied 
            if(pre == 0)
                pre =1;
            if(suff ==0)
                suff =1;
            pre *= arr[i];
            suff *=arr[n-i-1];
            result = Math.max(result, Math.max(pre, suff));
        }
        return result;
    }
}
