package com.code.java.course.gfg.Week4.Strings.videos;

public class _9_ReverseWordsInAString {
    public static void main(String[] args) {
        reverseNaive("my name is subhajit");
        String str = "my name is ram";
        char[] arr = str.toCharArray();
        reverseWords(arr,arr.length);
        System.out.println(arr);
    }
    //time : O(n) space:O(1)
    static void reverseWords(char str[],int n){
        int start =0;
        for(int end =0 ;end<n;end++){
            if(str[end]==' '){
                reverse(str,start,end-1);
                start = end+1;
            }
        }
        reverse(str,start,n-1);
        reverse(str,0,n-1);
    }
    private static void reverse(char[] str, int low, int high) {
        while(low<=high){
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }

    //Time : O(n) space:O(1)
    static int reverseNaive(String str){
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0)
                sb.append(" ");
        }
        System.out.println(sb.toString());
        return sb.length();
    }
}
