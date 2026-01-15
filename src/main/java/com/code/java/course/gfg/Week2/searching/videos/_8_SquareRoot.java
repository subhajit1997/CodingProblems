package com.code.java.course.gfg.Week2.searching.videos;

public class _8_SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRootNaive(10));
        System.out.println(squareRootBinary(10));
    }
    // Naive solution- Time Complexity: O(x^(1/2))
    static int squareRootNaive(int x){
        int i=1;
        while(i*i<=x){
            i++;
        }
        return (i-1);
    }
    //using binnaryt search find square of number - Time Complexity: O(log(N))
    static int squareRootBinary(int x){
        int low=1,high = x, ans =-1;
        while(low<=high){
            int mid = (low+high)/2;
            int mSquareRoot = mid*mid;
            if(mSquareRoot==x){
                return mid;
            }else if(mSquareRoot>x){
                high = mid-1;
            }else{
                low=mid+1;
                ans = mid;
            }
        }
        return ans;
    }

}
