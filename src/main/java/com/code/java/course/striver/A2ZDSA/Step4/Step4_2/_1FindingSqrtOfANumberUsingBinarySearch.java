package com.code.java.course.striver.A2ZDSA.Step4.Step4_2;

/**
 * learn:https://takeuforward.org/binary-search/finding-sqrt-of-a-number-using-binary-search/
 * practice:https://www.codingninjas.com/studio/problems/square-root-integral_893351?leftPanelTab=0?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 *
 */
public class _1FindingSqrtOfANumberUsingBinarySearch {
    public static void main(String[] args) {
        System.out.println(sqrtN(100));
        System.out.println(sqrtNOptimised(100));

    }

    //brute force time   -O(N)
    public static int sqrtN(long N) {
        int res=0;
        for(long i=1;i<=N;i++){
            long val = i*i;
            if(val<=N )
                res = (int)i;
            else
                break;
        }
        return res;
    }

    //Optimised approach binary search O(log(N))
    public static int sqrtNOptimised(long N) {
        int res=0;
        long low =1;
        long high = N;
        while(low<=high){
            long mid = (low+high)/2;
            if((mid*mid)<=N){
                res = (int)mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return res;
    }
}
