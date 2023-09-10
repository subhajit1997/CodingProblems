package com.problems.course.striver.A2ZDSA.Step1.Step1_4;

public class sum_of_divisors {
    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(45));
        System.out.println(sumOfAllDivisors1(45));
        System.out.println(sumOfAllDivisorsOptimized(45));
        System.out.println(sumOfAllDivisorsBest(45));
    }
    //this taes more time - so time limit may exceed
    public static int sumOfAllDivisors(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum = sum+ divisor(i);
        }
        return sum;
    }
    public static int divisor(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum =sum+i;

            }
        }
        return sum;
    }
    public static int sumOfAllDivisors1(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }

        }
        return sum;
    }

    //O(n*sqrt(n))
    public static int sumOfAllDivisorsOptimized(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    if(i/j==j){
                        sum+=j;
                    }else{

                        sum += j+i/j;

                    }
                }
            }
        }
        return sum;
    }

    //best - O(sqrt(n))
    public static int sumOfAllDivisorsBest(int n){
        int ans = 0;
        int l = 1;

        // Iterating over all values of 'l' such that 'n/l' is distinct.
        // There at most 2*sqrt(n) such values.
        while (l <= n)
        {
            int val = n / l;

            // 'r' = maximum value of 'i' such that 'n/i' is val.
            int r = n / val;

            ans += ((r * (r + 1)) / 2 - (l * (l - 1)) / 2) * val;

            // moving on to next range.
            l = r + 1;
        }

        return ans;
    }

}
