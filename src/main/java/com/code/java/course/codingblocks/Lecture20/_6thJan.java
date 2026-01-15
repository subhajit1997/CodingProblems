package com.code.java.course.codingblocks.Lecture20;

public class _6thJan {
    public static void main(String[] args) {
        /* fibonachi recursive
            do recursion when : we need to print all posibilities of coin toss/substring etc 
            
            0   0   1   1   2   3   5   ....
            small subproblem: for finding 5th fibonachi , if we had 4th and 3rd fibonachi, then 4th+3rd =5th term

            base case:  if we reach 0/1 
        */
        System.out.println(findFibonachiSeries(10));

        /*
            Q) coin toss
                we have n coins , now toss n coins like n=3 , 
                you have to print all posible combinations of all n tosses
                
                n=3
                1   2   3
                -----------
                H   H   H
                H   H   T
                H   T   H
                H   T   T
                T   H   H
                T   H   T
                T   T   H
                T   T   T
                possibilites= 2*2*2 = 8 possibilite
            ans-> 
                 sub-problem : I place one coin and ask recursin for n-1 combination
                 for n=3)   
                    (I place at 1)   [recursion places 2 combination]
                    (H)[HH]         (T)[HH]
                    (H)[HT]         (T)[HT]
                    (H)[TH]         (T)[TH]
                    (H)[TT]         (T)[TT]
                base case: n=0
         */
        coinTossRecursion(3,"");

        /*
            coinTossRecursion print if string does not have consecutive 
        */
       System.out.println("coinTossRecursionConsecutive");
       coinTossRecursionConsecutive(3,"");

       /*
        print all valid paremnthesis
       */
      System.out.println("validParenthesisPrint");
      validParenthesisPrint(3,0,0,"");

      /*
        sub-string print all posibil substrings in lexicogophraplical order
      */
     System.out.println("subStringRecusibe");
     System.out.println(subStringRecusibe("abc",""));
     
    }

    private static int subStringRecusibe(String s, String ans) {
        if(s.length()==0){
            System.out.println(ans);
            return 1;
        }
        char ch = s.charAt(0);
        int inc= subStringRecusibe(s.substring(1), ans+ch); //include ch
        int exc = subStringRecusibe(s.substring(1), ans);//exclude ch
        return inc+exc;

    }

    private static void validParenthesisPrint(int n, int open, int close, String ans) {
        if(open>n){ //-ve base case as no-meaningful ans
            return;
        }
        if(open==n && close==n){
            System.out.println(ans);
            return;
        }
        validParenthesisPrint(n, open+1, close, ans+"(");
        if(open>close){
            validParenthesisPrint(n, open, close+1, ans+")");
        }

    }

    private static void coinTossRecursionConsecutive(int i, String ans) {
        if(i==0 ){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
            coinTossRecursionConsecutive(i-1,ans+"H");
        coinTossRecursionConsecutive(i-1,ans+"T");
    }

    private static void coinTossRecursion(int n, String ans) {
        if(n==0){
            System.out.println(ans);
            return;
        }
        coinTossRecursion(n-1, ans+"H");
        coinTossRecursion(n-1, ans+"T");
    }

    private static int findFibonachiSeries(int n) {
        //for getting n we need n-1 and n-2 
        //base case- > when n=0 return 0 , when n=1 return 1
        if(n==0 || n==1)
            return n;
        int f1 =  findFibonachiSeries(n-1);
        int f2=   findFibonachiSeries(n-2);
        return f1+f2;
    }
}
