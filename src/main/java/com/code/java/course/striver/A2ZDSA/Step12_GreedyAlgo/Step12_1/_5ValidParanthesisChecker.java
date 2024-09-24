package com.code.java.course.striver.A2ZDSA.Step12_GreedyAlgo.Step12_1;

public class _5ValidParanthesisChecker {
    public static void main(String[] args) {
        System.out.println(checkValidString("(*))"));
    }
    //greedy approach
    //Time : O(N)
    public static boolean checkValidString(String s) {
        //cmax counts the maximum open parenthesis, which means the maximum number of unbalanced '(' that COULD be paired.
        //cmin counts the minimum open parenthesis, which means the number of unbalanced '(' that MUST be paired.
        int cmax =0,cmin=0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                cmax++; //incrasing the maximum number of open parenthesis count
                cmin++; //incrasing the minimum number of open parenthesis count
            }
            else if(ch== ')'){
                cmax--; //decreasing the maximum number of open parenthesis count and balancing
                cmin--;//decreasing the minimum number of open parenthesis count and balancing
            }
            else if(ch == '*'){ //two possibility of * is that it can provide open parenthesis or close parenthesis
                cmax++; //incrasing the maximum number of open parenthesis count
                cmin--;//balancing the minimum number of open parenthesis
                //new range [cmin-1, cmax+1]
            }

            if(cmax<0) //cmax will never be negative, to be balanced since number of open parentethesis cannot be less than the close parenthesis
                return false;//if less returning false
            cmin = Math.max(0,cmin); //cmin cannot be less than 0, it must be greater than 0
        }
        return cmin==0; //cmin is 0 at the end, to be balanced//all open parenthesis is balanced
    }

}
