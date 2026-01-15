package com.code.java.course.codingblocks.Lecture22;

public class _8thJan {
    public static void main(String[] args) {
        /*
            Q) tricky permutation
            permutation with unique ans , 

        */
        System.out.println("findPermutation unique");
        findPermutation("aba","");

        /*
            Q) keypad question
            example, in keypad phone  key 1 -> abc, key 2->def
            words:: ad,ae,af,bd,be,bf,cd,ce,cf

            find all possibnle words of a given keypad string

            123:  abc def ghi

            
            recurring sub-problem: i will find possiblities of pressing 1 , let recurssion find rest of the posibilities of 2 and 3
        */
       System.out.println("keypadCombination");
       String keypad[] = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
       keypadCombination("123","",keypad);

       /*
            lexolographical order: 
            1   10  100 11  12  13  14  15  16  17  18  19  2   20  ....29  3

            
       */
      //0 is start ie the ans , 1000 is the nth value
      System.out.println("lexolographicalOrder");
      lexolographicalOrder(0,10);
      
      /*
        Q) coin change : 

        sub-probelm: i will take one value and recurrsion bring all posibilites to add up to target
      */
     int coin[] = {1,2,3};
     int target=5;
     System.out.println("coinPermutationRecursion");
     coinPermutationRecursion(coin,target,"");

     //distinct coin change
    System.out.println("coinPermutationRecursion distinct");
     coinPermutationRecursionDistinct(coin,target,"");
    }
    //TO:DO
    private static void coinPermutationRecursionDistinct(int[] coin, int target, String ans) {
        if(target==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if(target>=coin[i]){
                coinPermutationRecursion(coin, target-coin[i], ans+coin[i]);
            }
        }
    }

    private static void coinPermutationRecursion(int[] coin, int target, String ans) {
        if(target==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if(target>=coin[i]){
                coinPermutationRecursion(coin, target-coin[i], ans+coin[i]);
            }
        }
    }
    private static void lexolographicalOrder(int ans, int n) {
        if(ans>n){
            return;
        }
        System.out.println(ans);
        int i=0;
        if(ans==0)
            i=1;
        for (; i <=9; i++) {
            lexolographicalOrder(ans*10+i,n);
        }
    }
    private static void keypadCombination(String s, String ans, String[] keypad) {
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0); //i have taken  '1'
        String temp = keypad[ch-'0'];//abc
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            keypadCombination(s.substring(1), ans+c, keypad);
        }
    }
    private static void findPermutation(String input, String ans) {
        if(input.length()==0){
            System.out.println(ans);
            return;
        }
        boolean[] check = new boolean[26];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(check[ch-'a']==false){
                check[ch-'a']=true; //tells us char ch already visited
                String rest = input.substring(0, i) + input.substring(i + 1);
                findPermutation(rest,ans+ch);
            }

        }
    }
}
