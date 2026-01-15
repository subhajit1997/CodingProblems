package com.code.java.course.striver.A2ZDSA.Step3_Arrays.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_Lec2 {
    public static void main(String[] args) {
        System.out.println("Two Sum: "+Arrays.toString(lect2_1(new int[]{2,6,5,8,11},14))+
            "\n"+Arrays.toString(lect2_1_hashmap(new int[]{2,6,5,8,11},14))+
            "\n"+Arrays.toString(lect2_1_twopointer(new int[]{2,6,5,8,11},14)));
        System.out.println("Sort an array of 0s, 1s and 2s: "+Arrays.toString(lect2_2(new int[]{2,0,2,1,1,0}))+
            "\n"+Arrays.toString(lect2_2_threepointers(new int[]{2,0,2,1,1,0})));
        System.out.println("Find the Majority Element that occurs more than N/2 times: "+lect2_3_bruteforce(new int[]{4,4,2,4,3,4,4,3,2,4})+
            "\n"+lect2_3_hashmap(new int[]{4,4,2,4,3,4,4,3,2,4})+
            "\n"+lect2_3_mooresAlgo(new int[]{4,4,2,4,3,4,4,3,2,4}));
        System.out.println("Kadane's Algorithm : Maximum Subarray Sum in an Arra: "+lect2_4_bruteforce(new int[]{-2,1,-3,4,-1,2,1,-5,4})+
            "\n"+lect2_4_kadensAlgo(new int[]{-2,1,-3,4,-1,2,1,-5,4})+
            "\n"+Arrays.toString(lect2_4_kadensAlgoPrintSubarray(new int[]{-2,1,-3,4,-1,2,1,-5,4})));
        System.out.println("Stock Buy And Sell: "+lect2_6_brute_force(new int[]{7,1,5,3,6,4})+
            "\n"+lect2_6_optimised(new int[]{7,1,5,3,6,4}));
        System.out.println("Rearrange Array Elements by Sign: "+Arrays.toString(lect2_7_bruteForce(new int[]{1,2,-4,-5}))+
            "\n"+Arrays.toString(lect2_7_optimised(new int[]{1,2,-4,-5})));
        System.out.println((lect2_8_brute_force(Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0}))));
        System.out.println("Leaders in an Array: "+lect2_9_brute_force(new int[]{4, 7, 1, 0}) );
        System.out.println("Longest Consecutive Sequence in an Array: "+lect2_10_brute_force(new int[]{3, 8, 5, 7, 6})+
            "\n"+lect2_10_set(new int[]{3, 8, 5, 7, 6}));
        System.out.println("Set Matrix Zero: "+Arrays.deepToString(lect2_11_bruteforce(new int[][]{{1,1,1},{1,0,1},{1,1,1}}))+
            "\n"+Arrays.deepToString(lect2_11_optimal(new int[][]{{1,1,1},{1,0,1},{1,1,1}})));
        System.out.println("Rotate Image by 90 degree: "+Arrays.deepToString(lect2_12_brute_force(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}))+
            "\n"+Arrays.deepToString(lect2_12_optimnal(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
        System.out.println("Spiral Traversal of Matrix: "+(lect2_13(new int[][]{{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}})));
    }

    //Problem Statement : Two Sum : Check if a pair with given sum exists in Array
    public static int[] lect2_1(int[] arr,int target){
        //time: O(N^2)
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] lect2_1_hashmap(int[] arr,int target){
        int[] ans = new int[]{-1,-1};
        HashMap<Integer ,Integer> mpp= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int moreNeeded = target-num;
            if(mpp.containsKey(moreNeeded)){
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }
            mpp.put(num, i);
        }
        return ans;
    }
    public static int[] lect2_1_twopointer(int[] arr,int target){
        //Nlog(N)
        int n = arr.length;
        int left=0,right = n-1;
        while (left<right) {
            int sum = arr[left]+arr[right];
            if(sum==target)
                return new int[]{left,right};
            else if(sum>target)
                right--;
            else
                left++;
        }
        return new int[]{-1,-1};
    }
    //Problem Statement :Sort an array of 0s, 1s and 2s
    public static int[] lect2_2(int[] arr){
        int count0=0,count1=0;
        for(int i=0;i<arr.length;i++){
            int val=arr[i];
            if(val==0)
                count0++;
            else if(val==1)
                count1++;
        }
        for(int i=0;i<count0;i++){
            arr[i]=0;
        }
        for(int i=count0;i<count0+count1;i++){
            arr[i]=1;
        }
        for(int i=count0+count1;i<arr.length;i++){
            arr[i]=2;
        }
        return arr;
    }
    public static int[] lect2_2_threepointers(int[] arr){
        //time :O(N)
        int low=0,mid=0,high=arr.length-1;
        while (mid<=high) {
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low]=arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else if(arr[mid]==2){
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
        return arr;
    }
    //Problem Statement : Find the Majority Element that occurs more than N/2 times
    public static int lect2_3_bruteforce(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>(arr.length/2)){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static int lect2_3_hashmap(int[] arr){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value+1);
        }
        for(Map.Entry<Integer,Integer> it:mpp.entrySet()){
            if(it.getValue()>(arr.length/2))
                return it.getKey();
        }
        return -1;
    }
    public static int lect2_3_mooresAlgo(int[] arr){
        int n = arr.length;
        int count=0;
        int element =0;

        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                element = arr[i];
            }else if(element == arr[i])
                count++;
            else
                count--;
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==element)
                count1++;
        }
        if(count1 >(n/2))
            return element;
        return -1;
    }
    //Problem Statement :Kadane's Algorithm : Maximum Subarray Sum in an Arra
    public static int lect2_4_bruteforce(int[] arr){
        //O(N^2)
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
    public static int lect2_4_kadensAlgo(int[] arr){
        //O(N)
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>max){
                max =sum;
            }
            if(sum<0)
                sum=0;
        }
        return max;
    }
    public static int[] lect2_4_kadensAlgoPrintSubarray(int[] arr){
        //O(N)
        int max = Integer.MIN_VALUE;
        int sum=0;
        int start=0,ansStart=-1,ansEnd=-1;
        for(int i=0;i<arr.length;i++){

            if(sum==0){
                start=i;
            }

            sum+=arr[i];
            if(sum>max){
                max =sum;

                ansStart = start;
                ansEnd = i;
            }
            if(sum<0)
                sum=0;
        }
        return Arrays.copyOfRange(arr, ansStart, ansEnd);
    }
    //Problem Statement : Stock Buy And Sell
    public static int lect2_6_brute_force(int[] arr){
        //O(N^2)
        int n = arr.length;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            int profit = 0;
            for(int j=i+1;j<n;j++){
                profit = arr[j]-arr[i];
                if(profit>0){
                    maxProfit= Math.max(maxProfit, profit);
                }
            }
        }
        return maxProfit;
    }
    public static int lect2_6_optimised(int[] arr){
        //O(N)
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i]-minPrice);
        }
        return maxProfit;
    }
    //Problem Statement :Rearrange Array Elements by Sign
    public static int[] lect2_7_bruteForce(int[] arr){
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
                positive.add(arr[i]);
            else
                negative.add(arr[i]);
        }
        for(int i=0;i<arr.length/2;i++){
            arr[2*i] = positive.get(i);
            arr[2*i+1] = negative.get(i);
        }
        return arr;
    }
    public static int[] lect2_7_optimised(int[] arr){
        //using one extra array space
        int n = arr.length;
        int[] ans = new int[n];
        int positiveIndex=0,negativeIndex=1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[positiveIndex] =arr[i];
                positiveIndex +=2;
            }else{
                ans[negativeIndex]= arr[i];
                negativeIndex+=2;
            }
        }
        return ans;
    }
    //Problem Statement :next_permutation : find next lexicographically greater permutation
    public static List<Integer> lect2_8_brute_force(List<Integer> arr){

        //step1: find the break point
        //step1_a: if break does not exist reverse whole array and return
        //step 2: find next greater element and swap with arr[ind]
        //step2_a: reverse right half

        
        int n = arr.size();
        //step1: find the break point
        int breakIndex = -1;
        for(int i=n-2;i>=0;i--){
            if(arr.get(i)<arr.get(i+1)){
                breakIndex = i;
                break;
            }
        }
        //step1_a: if break does not exist reverse whole array
        if(breakIndex == -1){
            Collections.reverse(arr);
            return arr;
        }
        //step 2: find next greater element and swap with arr[ind]
        for(int i=n-1;i>breakIndex ; i--){
            if(arr.get(i)>arr.get(breakIndex)){
                int temp = arr.get(i);
                arr.set(i, arr.get(breakIndex));
                arr.set(breakIndex, temp);
                break;
            }
        }
        //step2_a: reverse right half 
        List<Integer> newList = arr.subList(breakIndex+1, n);
        Collections.reverse(newList);
        return arr;
    }
    //Problem Statement :Leaders in an Array
    public static List<Integer> lect2_9_brute_force(int[] arr){
        int maxElement = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>maxElement){
                res.add(arr[i]);
                maxElement = arr[i];
            }
        }
        return res;
    }

    //Problem Statement :Longest Consecutive Sequence in an Array
    public static int lect2_10_brute_force(int[] arr){
        // Time: O(NlogN) + O(N)
        Arrays.sort(arr);
        int maxLen = 1;
        int count =1;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]+1)==(arr[i+1])){
                count++;
            }else{
                count=1;
            }
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
    public static int lect2_10_set(int[] arr){
        int n = arr.length;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int i : set){
            if(!set.contains(i-1)){
                int count = 1;
                int currentVal = i;
                while (set.contains(currentVal+1)) {
                    currentVal = currentVal+1;
                    count = count +1;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }    
    //Problem Statement : Set Matrix Zero
    public static int[][] lect2_11_bruteforce(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[] row = new int[n];
        int[] coloumn = new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i] =1;
                    coloumn[i] =1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || coloumn[j]==1){
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }
    public static int[][] lect2_11_optimal(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        int coloumn0=1;
         // step 1: Traverse the matrix and mark 1st row & col accordingly:
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    arr[i][0] = 0;
                    if(j!=0){
                        arr[0][j]=0;
                    }else
                        coloumn0=0;
                }
            }
        }
         // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]!=0){
                    if(arr[i][0] ==0 || arr[0][j] == 0){
                        arr[i][j]=0;
                    }
                }
            }
        }
        //step 3: Finally mark the 1st col & then 1st row:
        if(arr[0][0]==0){
            for(int j=0;j<m;j++){
                arr[0][j] = 0;
            }
        }
        if(coloumn0==0){
            for(int i=0;i<n;i++){
                arr[i][0]=0;
            }
        }
        return arr;
    }
    //Problem Statement :Rotate Image by 90 degree
    /*
     * 123
     * 456
     * 789
     *
     * =>
     * 741
     * 852
     * 963
     */
    public static int[][] lect2_12_brute_force(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[][] rotate = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rotate[j][n-i-1] = arr[i][j];
            }
        }
        return rotate;
    }
    public static int[][] lect2_12_optimnal(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        //rotate diagonally 
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]=temp;
            }
        }
        //rotate rows verizontally
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1]=temp;
            }
        }
        return arr;
    }
    //Problem Statement :Spiral Traversal of Matrix
    /*
        Input: Matrix[][] = { { 1, 2, 3, 4 },
                              { 5, 6, 7, 8 },
                              { 9, 10, 11, 12 },
                            { 13, 14, 15, 16 } }

        Outhput: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
     */
    public static List<Integer> lect2_13(int[][] arr){
        int n = arr.length, m = arr[0].length;
         List<Integer> ans = new ArrayList<>();
         int top=0,left =0, bottom = n-1,right = m-1;
         while (top<=bottom && left<=right) {
            //left to right
            for(int i = left ;i<=right;i++)
                ans.add(arr[top][i]);
            top++;

            //top to bottom
            for(int i=top ; i<=bottom;i++)
                ans.add(arr[i][right]);
            right--;

            //right to left
            if(top<=bottom){
                for(int i= right;i>=left ; i--)
                    ans.add(arr[bottom][i]);
                bottom--;
            }

            //bottom to top
            if(left<=right){
                for(int i = bottom ;i>=top;i--)
                    ans.add(arr[i][left]);
                left++;
            }
         }
         return ans;
    }
    //remaining : Count total number subarray with given sum 
}
