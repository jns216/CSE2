//lab 12
//print out and operate on row- and column- major matrices represented by two dimensional arrays.

public class lab12 {
    public static void main (String[] args){
    int height1 = (int)(Math.random()*10 + 1);
    int width1 = (int)(Math.random()*10 + 1);
    int height2 = (int)(Math.random()*10 + 1);
    int width2 = (int)(Math.random()*10 + 1);
    
    int[][] A = increasingMatrix(width1,height1,true);
    int[][] B = increasingMatrix(width1,height1,false);
    int[][] C = increasingMatrix(width2,height2,true);
    System.out.println("Matrix A");
    printMatrix(A);
    System.out.println("Matrix B");
    printMatrix(B);
    System.out.println("Matrix C");
    printMatrix(C);
    System.out.println();
    
    int[][] newB = translate(B);
    printMatrix(newB);
    System.out.println();
    
    int[][] aBSum = addMatrix(A,true,newB,false);
    System.out.println("Sum of A and B");
    printMatrix(aBSum);
    System.out.println("Sum of A and C");
    int[][] aCSum = addMatrix(A,true,C,true);
    printMatrix(aCSum);
    }//end main method
    
    public static int [][] increasingMatrix (int width, int height, boolean format) {
        int[][] matrix = new int[height][width];
        int counter = 1;
        if (format==true){
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = counter;
                counter++;
            }
        }
        }
        if (format==false){
        for (int j=0; j<matrix.length; j++) {
            for (int i=0; i<matrix[j].length; i++) {
                matrix[j][i] = counter;
                counter++;
            }
        }    
        }
        return matrix;
    }//end increasingMatrix 
    
    public static void printMatrix (int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        return;
    }//end printMatrix

    public static int[][] translate (int[][] array) {
        int[][] matrix = new int[array[0].length][array.length];
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[0].length; j++) {
                matrix[j][i] = array[i][j];
            }
        }
        return matrix;
    }
    public static int[][] addMatrix ( int[][] a, boolean formata, int[][] b, boolean formatb) {
        int m = a.length;
        int n = a[0].length;
        int[][] c = new int[m][n];
        if ((a.length!=b.length)&&(a[0].length!=b[0].length)){
            System.out.println("the arrays cannot be added!");
            System.exit(0);
        }
        //if ((formata==true && formatb==true)||(formata==false && formatb==false)){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        //}
        return c;
    }
}
