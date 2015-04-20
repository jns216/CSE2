//Homework 12
//Due Apri 21, 2015
//Jillian Saydah
//Implement matrix multiplication on random matrices

import java.util.Scanner;
public class Multiply {
    
    public static void main (String[] args){
    Scanner scan = new Scanner (System.in);
    //ask user for input
    boolean dimensionCheck = true;
    int width1;
    int width2;
    int height1;
    int height2;
    int[][] matrix1;
    int[][] matrix2;
    
    //do while loop to test that input is positive, integer, and dimensions are compatible
    do {
        //if the dimensions don't match, user needs to enter new dimensions
        if (!dimensionCheck){
        System.out.println("The user needs to input the dimension of both arrays again.");
        }
    System.out.print("Enter a width and height for the first matrix: ");    
    //while loop to check that width1 is an int and pos
    while (true){
        while (!scan.hasNextInt()){
            scan.next();
        }
        width1 = scan.nextInt();//input width
        if (width1<0){
            System.out.println("Please re-enter a positive integer.");
        }
        else {
            break;
        }
    }
    //while loop to check that height1 is an int and pos
    while (true){
        while (!scan.hasNextInt()){
            scan.next();
        }
        height1 = scan.nextInt();//input width
        if (height1<0){
            System.out.println("Please re-enter a positive integer.");
        }
        else {
            break;
        }
    }
    //generate first matrix
    matrix1 = randomMatrix(width1,height1);//call randomMatrix method
    //ask user to input dimensions of second matrix
    System.out.print("Enter a width and height for the second matrix: ");
    //while loop to check that width2 is int and pos
    while (true){
        while (!scan.hasNextInt()){
            scan.next();
        }
        width2 = scan.nextInt();//input width
        if (width2<0){
            System.out.println("Please re-enter a positive integer.");
        }
        else {
            break;
        }
    }
    //while loop to check that height2 is int and pos
    while (true){
        while (!scan.hasNextInt()){
            scan.next();
        }
        height2 = scan.nextInt();//input width
        if (height2<0){
            System.out.println("Please re-enter a positive integer.");
        }
        else {
            break;
        }
    }
    //generate second matrix
    matrix2 = randomMatrix(width2,height2);
    //if the dimensions check 
    if (width1==height2){
        dimensionCheck = true;
    }
    //if the dimensions don't check
    else {
        dimensionCheck = false;
    }
    } while (!dimensionCheck);
    
    //print out the matrices
    System.out.println("The first matrix is: ");
    printMatrix(matrix1);
    System.out.println("The second matrix is: ");
    printMatrix(matrix2);
    
    //generate multipled matrices result
    int[][]newArray = matrixMultiply(matrix1,matrix2);
    System.out.println("The matrices multiplied are: ");
    printMatrix(newArray);
    }//end main method

    //method to generate random matrix
    public static int [][] randomMatrix(int width, int height){
    int[][] matrix = new int[height][width];
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random()*21 - 10);//generate random numbers to fill matrix
            }
        }
        return matrix;
    }//end randomMatrix
    
    //method to print out matrix
    public static void printMatrix (int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        return;
    }//end printMatrix
    
    //method to multiply matrix
    public static int [][] matrixMultiply (int[][] array1, int[][] array2) {
        int array1Rows = array1.length;
        int array1Columns = array1[0].length;
        int array2Rows = array2.length;
        int array2Columns = array2[0].length;
        //error message if dimensions don't match
        if (array1Columns != array2Rows) {
            System.out.println("The number of columns of the first array is not equal to the number of rows in the second array, multiplication is not possible.");
            System.exit(0);
        }
        //initialize and fill multiplied matrix
        int [][] newArray = new int [array1Rows][array2Columns];
        for (int i = 0; i < array1Rows; i++) {
            for (int j = 0; j < array2Columns; j++) { 
                for (int k = 0; k < array2Columns; k++) { 
                    newArray[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return newArray;
    }//end matrixMultiply
    
}//end class
