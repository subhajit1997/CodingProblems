package com.problems.company.Target;

import java.util.*;

public class Extra {
    int[][] data = new int[400][600];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of rectangles");
        int numRectangle = scanner.nextInt();
        scanner.nextLine();
        int[][] rectangles = new int[numRectangle][4];
        for(int i=0;i<numRectangle;i++){
            System.out.print("Enter rectangle coordinates for i:"+i);
            String rectangle = scanner.nextLine();
            rectangles[i] = convertStringToArray(rectangle);
        }
        Extra extra =new Extra();
        extra.markBarrenLand(rectangles);
        List<Integer> output = extra.mainResultFinder();
        System.out.println(output.toString());

    }

    private List<Integer> mainResultFinder() {
        List<Integer> value = new ArrayList<>();
        Cell1 currentCell;
        while((currentCell = findNextPointFertilazedLand())!=null){
            value.add(interteFill(currentCell));

        }
        Collections.sort(value);
        return value;
    }

    private int interteFill(Cell1 currentCell) {
        int area = 0;
        Stack<Cell1> cellToCheck =new Stack<>();
        cellToCheck.push(currentCell);
        while (cellToCheck.isEmpty()==false){
            Cell1 newCell = cellToCheck.pop();
            int i = newCell.i;
            int j=newCell.j;
            area += checkValidFarmBoundary(cellToCheck,i-1,j);
            area += checkValidFarmBoundary(cellToCheck,i+1,j);
            area += checkValidFarmBoundary(cellToCheck,i,j-1);
            area += checkValidFarmBoundary(cellToCheck,i,j+1);
        }
        return area;
    }

    private int checkValidFarmBoundary(Stack<Cell1> newCell, int i, int j) {
        if(i>=0 && i<data.length && j>=0 && j<data[0].length && data[i][j]==0){
            data[i][j]=2;
            newCell.push(new Cell1(i,j));
            return 1;
        }
        return 0;
    }

    private Cell1 findNextPointFertilazedLand() {
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                if(data[i][j]==0){
                    return new Cell1(i,j);
                }
            }
        }
        return null;
    }

    private void markBarrenLand(int[][] rectangles) {
        for(int i =0;i<data.length;i++){
            for(int j=0;j<data[i].length ;j++){
                for(int[] r:rectangles) {
                    if(insideRectangle(i,j,r)) {
                        data[i][j] = 1;
                        break;
                    }
                }
            }
        }
    }

    private boolean insideRectangle(int i, int j, int[] r) {
        return (i>=r[0]&& i<=r[2])&&(j>=r[1]&& j<=r[3]);
    }

    private static int[] convertStringToArray(String rectangle) {
        String[] value= rectangle.split(" ");
        int[] result = new int[4];
        for(int i=0;i<4;i++){
            result[i] = Integer.parseInt(value[i]);
        }
        return  result;
    }
}
class Cell1{
    int i;
    int j;
    Cell1(int i,int j){
        this.j=i;
        this.j=j;
    }

}