package com.code.java.company.Target;

/**
 * Programming Exercise
 *
 * #######################################################
 *
 * Barren Land Analysis
 *
 * You have a farm of 400m by 600m where coordinates of the field are from (0, 0) to (399, 599). A portion of the farm is barren, and all the barren land is in the form of rectangles. Due to these rectangles of barren land, the remaining area of fertile land is in no particular shape. An area of fertile land is defined as the largest area of land that is not covered by any of the rectangles of barren land. Read input from STDIN. Print output to STDOUT
 *
 * Input You are given a set of rectangles that contain the barren land. These rectangles are defined in a string, which consists of four integers separated by single spaces, with no additional spaces in the string. The first two integers are the coordinates of the bottom left corner in the given rectangle, and the last two integers are the coordinates of the top right corner.
 *
 * Output Output all the fertile land area in square meters, sorted from smallest area to greatest, separated by a space.
 *
 * Example1: Input: {“0 292 399 307”} Output: 116800 116800
 *
 * Example2: Input:{“48 192 351 207”, “48 392 351 407”, “120 52 135 547”, “260 52 275 547”} Output:22816 192608
 */

import java.util.*;


public class BarrenLandAnalysis {

        // holds "image" of land
        public   int[][] data = new int[400][600];
        // {0,292,399,307}


        public static void main(String[] args) {
            BarrenLandAnalysis m = new BarrenLandAnalysis();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of rectangles: ");
            int numRectangles = scanner.nextInt();
            scanner.nextLine();
            int[][] rectangles = new int[numRectangles][4];

            for (int i = 0; i < numRectangles; i++) {
                System.out.printf("Enter rectangle %d coordinates (space-separated): ", i + 1);
                String rectangleInput = scanner.nextLine();
                rectangles[i] = convertStringToIntArray(rectangleInput);
            }

            scanner.close();
            m.markBarrenLand(rectangles);
            m.run();
        }
        private static int[] convertStringToIntArray(String input) {
            String[] values = input.split(" ");
            int[] result = new int[4];
            for (int i = 0; i < 4; i++) {
                result[i] = Integer.parseInt(values[i]);
            }
            return result;
        }

        /**
         * The markBarrenLand() method is responsible for marking the barren land in the data array. It iterates over
         * each cell in the array and checks if it falls within any of the defined rectangles.
         * If a cell is inside a rectangle, it is marked as barren by setting its value to 1.
         */
        // fertile land is 0, mark barren land as 1
        private void markBarrenLand(int[][] rects) { //int[] r1, int[] r2, int[] r3, int[] r4
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    for (int[] r : rects) {
                        if (insideRect(i, j, r)) {
                            data[i][j] = 1;
                            break;
                        }
                    }
                }
            }
        }


        /**
         * he insideRect() method is used to check if a given coordinate pair falls inside a specified rectangle.
         * Its purpose is to determine if a particular cell in the data array represents a position within a barren land rectangle.
         */
        private boolean insideRect(int i, int j, int[] rect) {
            return (i >= rect[0] && i <= rect[2]) && (j >= rect[1] && j <= rect[3]);
        }

        /**
         *The run() method is the main part of the algorithm. It uses a flood-fill approach to find and calculate the
         * areas of fertile land. It repeatedly calls the findNextPoint() method to get the next unvisited fertile
         * cell and performs flood-fill starting from that cell.
         */
        // there can be disjoint peices of farmland so we flood fill each section one by one until there is no section left
        private void run() {
            List<Integer> vals = new ArrayList<>();
            Cell current;
            while ((current = findNextPointFertileLand()) != null) {
                vals.add(iterativeFill(current));
            }
            // sort the collection in lest to greatest order
            Collections.sort(vals);
            // print out list of vals
            for (Integer i : vals) {
                System.out.printf("%d,", i);
            }
            System.out.println("");
        }

        /**
         * The iterativeFill() method performs the flood-fill algorithm. It takes a starting cell and uses a stack
         * called cellToCheck to keep track of cells that need to be processed. It iteratively processes cells
         * from the stack, marks them as visited (setting their value to 2), and checks their neighboring cells.
         * The method returns the area of the fertile land it has filled.
         */
        // main flood fill algorithm
        // from a starting cell we check all four directions, then from the new cells we check all for directions, etc...
        // a stack is used to remember what cells still need processing
        private int iterativeFill(Cell c) {
            int area = 0;
            Stack<Cell> cellToCheck = new Stack<>();
            cellToCheck.push(c);
            while (cellToCheck.isEmpty() == false) {
                Cell currentCell = cellToCheck.pop();
                int i = currentCell.i;
                int j = currentCell.j;
                area += checkValidWithinFarmBoundary(cellToCheck, i - 1, j); //up
                area += checkValidWithinFarmBoundary(cellToCheck, i + 1, j); //down
                area += checkValidWithinFarmBoundary(cellToCheck, i, j - 1); //left
                area += checkValidWithinFarmBoundary(cellToCheck, i, j + 1); //right
            }
            return area;
        }

        /**
         * he helper() method is a helper function used by iterativeFill(). It checks if a given coordinate pair is
         * valid and falls within the farm boundaries. If it is valid and represents a fertile cell,
         * it marks it as visited, pushes it onto the stack, and returns 1. Otherwise, it returns 0.
         */
        // if the xy pair is valid, mark it as visited and push the new cell onto the given stack
        // we also return if the location was valid: 0 for invalid 1 for valid
        private int checkValidWithinFarmBoundary(Stack<Cell> cells, int i, int j) {
            if (i >= 0 && i < data.length && j >= 0 && j < data[0].length && data[i][j] == 0) { // // checks if the coordiante pair is inside the farmland square and if it is fertile and unvisited
                data[i][j] = 2;
                cells.push(new Cell(i, j));
                return 1;
            }
            return 0;
        }

        /**
         * The findNextPoint() method searches the data array for the next unvisited fertile cell (cell value is 0) and returns its coordinates as a Cell object.
         */
        // finds the next peice of fertile land ie data[i][j]==0
        private Cell findNextPointFertileLand() {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++) {
                    if (data[i][j] == 0) {
                        return new Cell(i, j);
                    }
                }
            }
            return null;
        }

    }

/**
 * The purpose of the Cell class is to encapsulate the coordinates of a cell together, making it easier to pass and
 * manipulate the coordinates as a single object. It is primarily used within the flood-fill algorithm in the iterativeFill() method.
 */
// tuple holding a int pair
    class Cell {

        final int i;
        final int j;

        Cell(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }