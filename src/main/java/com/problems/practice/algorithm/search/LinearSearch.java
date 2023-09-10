package com.problems.practice.algorithm.search;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int x=3;
		int result = search(arr,x);
		if(result==-1){
			System.out.println("Element not found");
		}else{
			System.out.println("Found at index: "+result);
		}

	}

	private static int search(int[] arr, int x) {
		if(arr.length>0){
			for(int i=0;i<arr.length;i++){
				if(arr[i]==x){
					return i;
				}
			}
		}
		return -1;
	}

}
