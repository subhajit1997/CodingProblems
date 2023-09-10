package com.problems.course.udmey.dsa_masterclass.section3;

public class TwoDimensionalArray {
    static int[][] arr =null;
    TwoDimensionalArray(int row, int col){
        this.arr = new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=Integer.MIN_VALUE;
            }
        }
    }
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(2,2);
        twoDimensionalArray.insertTwoDimensionalArray(0,0,1);
        twoDimensionalArray.insertTwoDimensionalArray(0,1,2);
        twoDimensionalArray.insertTwoDimensionalArray(1,0,3);
        twoDimensionalArray.insertTwoDimensionalArray(1,1,4);
        twoDimensionalArray.traverseTwoDArray();
        twoDimensionalArray.accessCell(1,0);
        twoDimensionalArray.searchValue(4);
        twoDimensionalArray.deleteValue(1,1);
        twoDimensionalArray.searchValue(4);
    }
    public void insertTwoDimensionalArray(int row, int col, int val){
        try{
            if(arr[row][col]==Integer.MIN_VALUE){
                arr[row][col]=val;
                System.out.println("Inserted");
            }else {
                System.out.println("Already occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid");
        }
    }
    public void deleteValue(int row, int col){
        try{
            int temp=arr[row][col];
            arr[row][col]=Integer.MIN_VALUE;
            System.out.println("Deleted value : "+temp);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid");
        }
    }
    public void accessCell(int row,int col){
        System.out.print("Accessing row:"+row+", coloumn:"+col);
        try {
            System.out.println("\t output : "+arr[row][col]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid");
        }
    }
    public void traverseTwoDArray(){
        System.out.println("Traversing array:");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void searchValue(int val){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if(val==arr[i][j]){
                    System.out.println("value : "+val+"found at row:"+i+" ,  column:"+j);
                    return;
                }
            }
        }
        System.out.println("value :"+val+" not found");
    }
}
