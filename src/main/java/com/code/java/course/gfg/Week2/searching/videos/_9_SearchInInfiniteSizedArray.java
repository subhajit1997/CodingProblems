package com.code.java.course.gfg.Week2.searching.videos;

public class _9_SearchInInfiniteSizedArray {
    public static void main(String[] args) {
        System.out.println(searchInfiniteNaive(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 10));
        System.out.println(searchInfiniteBinnary(new int[]{1,2,3,40,50}, 40));
    }
    // Naive solution- Time Complexity: O(X)
    static int searchInfiniteNaive(int arr[],int x){
        int i=0;
        while(true){
            if(arr[i]==x)
                return i;
            if(arr[i]>x)
                return -1;
            i++;
        }
    }
    //using binnaryt search find square of number - Time Complexity: O(log(X))
	static int searchInfiniteBinnary(int arr[], int x)
	{
		if(arr[0] == x) return 0;

		int i = 1;

		while(arr[i] < x)
			i = i * 2;

		if(arr[i] == x) return i;


		return bSearch(arr, i / 2 + 1, i - 1, x);
	}
    static int bSearch(int arr[], int low, int high, int x)
    {
        if(low > high)
            return -1;

        int mid = (low + high) / 2;

        if(arr[mid] == x)
            return mid;

        else if(arr[mid] > x)
            return bSearch(arr, low, mid - 1, x);

        else
            return bSearch(arr, mid + 1, high, x);
    }

}
