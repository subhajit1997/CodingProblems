package com.code.java.course.gfg.Week2.arrays.videos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListinJava {
    public static void main(String[] args) {
        int[] arr = {0,10,20,30,0,50,50,50,10,0};
        System.out.println(search(arr,5,200));
         int cap = 10; // Increased capacity
        int[] newArr = Arrays.copyOf(arr, cap);

        // Insert element at position 1
        newArr = insert(newArr, arr.length, 100, cap, 1);
        System.out.println("After insertion: "+Arrays.toString(newArr));
        System.out.println("largest: "+largest(arr));
        System.out.println("largestEfficent: "+largestEfficent(arr));
        System.out.println("secondLargestEleemnt: "+secondLargestEleemnt(arr));
        System.out.println("checkSorted: "+checkSorted(arr));
        System.out.println("reverseArray: ");
        System.out.println(Arrays.toString(reverseArray(arr)));
        delete(newArr, arr.length, 100);
        System.out.println("new count after removing duplicates "+removeDuplicatesSortedArray(arr));
        System.out.println("new count after removing duplicates effienrt  "+removeDuplicatesSortedArrayEffienect(arr));
        System.out.println("moveAllZeroEnd: "+Arrays.toString(moveAllZeroEnd(arr)));
        System.out.println("moveAllZeroEndEfficient: "+Arrays.toString(moveAllZeroEndEfficient(arr)));
        System.out.println("leftRotateByOne: "+Arrays.toString(leftRotateByOne(arr)));
        System.out.println("leftRotateByD: "+Arrays.toString(leftRotateByD(arr,3)));
        System.out.println("leftRotateByDEfficient: "+Arrays.toString(leftRotateByDEfficient(arr,4)));
        System.out.println("findLeaderInArray: ");
        findLeaderInArray(arr);
        findLeaderInArrayEfficient(arr);
        maximumDifferenceWithOrder(arr);
        maximumDifferenceWithOrderEfficient(arr);
        frequencyInSortedArray(arr);
        frequencyInSortedArrayAnotherApproach(arr);
    }
    static int search(int arr[],int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    static int[] insert(int arr[], int n,int x,int cap,int pos){
        if(n==cap){
            return arr;
        }
        int idx= pos-1;
        for(int i=n-1;i>=idx;i--){
            arr[i+1]=arr[i];
        }
        arr[idx]=x;
        return arr;
    }
    static int delete(int arr[],int n,int x){
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==x){
                break;
            }
        }
        if(i==n){
            return n;
        }
        for(int j=i;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        return n-1;
    }
    static int largest(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean flag = true;
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                return i;
            }
        }
        return -1;
    }
    static int largestEfficent(int[] arr){
        int n = arr.length;
        int res = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[res]){
                res = i;
            }
        }
        return res;
        
    }

    static int secondLargestEleemnt(int[] arr){
        int n = arr.length;
        int secondLargest = -1;
        int largest = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[largest]){
                secondLargest = largest;
                largest = i;
            }else if(arr[i]!=arr[largest]){
                if(secondLargest == -1 || arr[i]>=arr[secondLargest]){
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }

    static boolean checkSorted(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    static int[] reverseArray(int[] arr){
        int n=arr.length;
        int low = 0;
        int high = n-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }
    static int removeDuplicatesSortedArray(int[] arr){
        int temp[] = new int[arr.length];
        temp[0]= arr[0];
        int res =1;
        for(int i=1;i<arr.length;i++){
            if(temp[res-1]!=arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        for(int i=0;i<res;i++){
            arr[i] = temp[i];
        }
        return res;
    }

    static int removeDuplicatesSortedArrayEffienect(int[] arr){
        int n = arr.length;
        System.out.println("initial size: "+n);
        int res = 1; 
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
    static int[] moveAllZeroEnd(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=i+1;j<n;j++){
                    if(arr[j]!=0){
                        int temp = arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }   
            }
        }
        return arr;
    }
    static int[] moveAllZeroEndEfficient(int[] arr){
        int countZero = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[countZero];
                arr[countZero] = temp;
                countZero++;
            }
        }
        return arr;
    }
    static int[] leftRotateByOne(int[] arr){
        int n= arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }

    static int[] leftRotateByD(int[] arr,int d){
        for(int i=0;i<d;i++){
            leftRotateByOne(arr);
        }
        return arr;
    }
    static int[] leftRotateByDBetter(int[] arr,int d){
        int temp[] = new int[d];
        int n = arr.length;
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i];
        }
        return arr;
    }  
    static int[] leftRotateByDEfficient(int[] arr,int d){
        int n = arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    static void reverse(int[] arr,int low,int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    static void findLeaderInArray(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            boolean flag = true;
            for(int j= i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(arr[i]);
            }
        }
    }
    static void findLeaderInArrayEfficient(int[] arr){
        System.out.println("findLeaderInArrayEfficient: ");
        int n = arr.length;
        int currentLeader = arr[n-1];
        System.out.println(currentLeader);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>currentLeader){
                System.out.println(arr[i]);
                currentLeader = arr[i];
            }
        }
    }

    static void maximumDifferenceWithOrder(int[] arr){
        int res = arr[1]-arr[0];
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                res = Math.max(res,arr[j]-arr[i]);
            }
        }
        System.out.println("maximumDifferenceWithOrder: "+res);
    }
    static void maximumDifferenceWithOrderEfficient(int[] arr){
       int res = arr[1]-arr[0];
       int min = arr[0];
       for(int i=1;i<arr.length;i++){
        res = Math.max(res,arr[i]-min);
        min = Math.min(min,arr[i]);
       }
        System.out.println("maximumDifferenceWithOrderEfficient: "+res);
    }
    static void frequencyInSortedArray(int[] arr){
        Arrays.sort(arr);
        System.out.println("frequencyInSortedArray: ");
        int n=arr.length;
        int lastTraversed = arr[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==lastTraversed)
                count++;
            else{
                System.out.println(lastTraversed+" "+count);
                lastTraversed = arr[i];
                count=1;
            }
        }
        System.out.println(lastTraversed+" "+count);
    }
    static void frequencyInSortedArrayAnotherApproach(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println("frequencyInSortedArrayAnotherApproach: ");
        int freq =1;
        int i=1;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            i++;
            freq=1;
        }
        if(n==1 || arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1]+" "+1);
        }
    }
}
