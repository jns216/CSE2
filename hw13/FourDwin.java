//Homework 13
//Jillian Saydah
//Due May 1, 2015

//This homework gives you practice in:
//manipulating multidimensional arrays, 
//in writing methods that have array parameters, 
//and in searching and sorting arrays.
import java.text.*;
import java.util.Scanner;
public class FourDwin {
    public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    double [][][][] four;
    four = new double[3][][][];
    int X;
    int Y;
    //prompt user to enter input and test 
    while (true){
    System.out.print("Enter an X value: ");
    X = scan.nextInt();
    System.out.print("Enter a Y value > X: ");
    Y = scan.nextInt();
        if (Y>X){
            break;
        }
        else {
            System.out.println("Invalid.");
        }
    }
    //set size of array and fill with random numbers
    for (int i=0; i<3; i++){
        four[i] = new double [(int)(Math.random()*Y + X)][][];
        for (int j=0; j< four[i].length; j++){
            four[i][j] = new double [(int)(Math.random()*Y + X)][];
            for (int k =0; k< four[i][j].length; k++){
                four[i][j][k] = new double [(int)(Math.random()*Y + X)];
                for (int l =0; l< four[i][j][k].length; l++){
                    four[i][j][k][l] = Math.random()*31;
                }
            }
        }
    }
    //print original array and stats
    System.out.println("Original Array: ");
    printArray(four);
    System.out.println();
    statArray(four);
    System.out.println();
    //print out array just using 3D sort
    System.out.println("Sorted Array(just 3D): ");
    for (int i=0; i <four.length; i++){
                sort3DArray(four[i]);
            }
    printArray(four);
    System.out.println();
    //print out array using both sorts
    System.out.println("Sorted Array (4D and 3D): ");
    double[][][][] sorted =sort4DArray(four);
    printArray(sorted);
    System.out.println();
    //I printed both sorts because my 4D sort method isn't working completely, but I wanted to show that the 3D sort does work on its own
        
    }//end main method
    
    //method to compute stats
    public static void statArray (double[][][][] array){
    int sum=0;
    int num=0;
    for (int i=0; i<3; i++){
        for (int j=0; j< array[i].length; j++){
            for (int k =0; k< array[i][j].length; k++){
                for (int l =0; l< array[i][j][k].length; l++){
                sum+=array[i][j][k][l];
                num++;
                }
            }
        }
    }
    int mean = sum/num;
    System.out.println("The sum is: "+sum);
    System.out.println("The number of elements is: "+ num);
    System.out.println("The mean is: "+mean);
    } 
    
    //3D sort method
    public static void sort3DArray (double[][][] array){
    for (int j=0; j< array.length; j++){
            for (int k =0; k< array[j].length; k++){
                for (int m=0; m<array[j][k].length; m++){
                double min = array[j][k][m];
                int l;
                int index = 0;
                    for (l = m + 1; l< array[j][k].length; l++){
                        if (array[j][k][l]>min){
                            min = array[j][k][l];
                            index = l;
                        }//find min
                    }
                if (index!=m){
                double temp = array[j][k][index];
                array[j][k][index] = array[j][k][m];
                array[j][k][m] = temp;
                }//swap values
                }
            }
    }
    }
    
    //4D sort method
    public static double[][][][] sort4DArray (double[][][][] array){
       
        int i1=0,i2=0,i3=0,i4=0;
        for (int i=0; i<3; i++){
            for (int j=0; j< array[i].length; j++){
                for (int k =0; k< array[i][j].length; k++){
                    for (int l =0; l< array[i][j][k].length; l++){
                        if (i1<i){
                            i1=i;
                        }
                        if (i2<i){
                            i2=j;
                        }
                        if (i3<i){
                            i3=k;
                        }
                        if (i4<i){
                            i4=l;
                        }
                    }
                }
            }
        }
        
        double[][][][] newArray = new double [i1][i2][i3][i4];
        for (int i=1; i<array.length; i++){
            double index=array[i][0][0][0];
            int count=0;
            for (count=i-1; count>=0 && array[count][0][0][0]>index; count--){
                array[count+1]=array[count];
            }
            array[count+1][0][0][0]=index;
        }
            for (int i=0; i <array.length; i++){
                sort3DArray(array[i]);
            }
        return array;
    }
    
    //method to print array
    public static void printArray (double[][][][] array){
    DecimalFormat d = new DecimalFormat("0.0");
    System.out.print("(");
       for (int i=0; i<3; i++){
        System.out.print("(");
        for (int j=0; j< array[i].length; j++){
            System.out.print("(");
            for (int k =0; k< array[i][j].length; k++){
                System.out.print("{");
                for (int l =0; l< array[i][j][k].length; l++){
                    System.out.printf(d.format(array[i][j][k][l])+ " ");
                    if (l!=array[i][j][k].length - 1){
                    System.out.print(",");
                    }
                }
                System.out.print("}");
                
            }
            System.out.print(")");
        }
        System.out.print(")");
       }
       System.out.print(")");
    }
    
}//end class