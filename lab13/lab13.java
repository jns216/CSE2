
public class lab13 {
    public static void main (String [] args){
        int[][] array;
            array = new int[5][ ];
            array[0] = new int[5];
            array[1] = new int[8];
            array[2] = new int[11];
            array[3] = new int[14];
            array[4] = new int[17];
        
        for (int i=0; i<5; i++) {
            for (int j=0; j<array[i].length; j++) {
                array[i][j] = (int)(Math.random()*39);
            }
        }
    //print jagged array
    for (int k = 0; k < array.length; k++) {
            for (int m = 0; m < array[k].length; m++) {
                System.out.print(array[k][m] + " ");
            }
            System.out.print("\n");
        }
        System.out.println();
    //sort array
    for (int j = 0; j<5; j++) {
        for (int k = 0; k < array[0].length; k++){
            if (array[0][j] < array[0][k]) {
                int buffer = array[0][j];
                array[0][j] = array[0][k];
                array[0][k] = buffer; 
            }
        }
    }
    for (int j = 0; j<8; j++) {
        for (int k = 0; k < array[1].length; k++){
            if (array[1][j] < array[1][k]) {
                int buffer = array[1][j];
                array[1][j] = array[1][k];
                array[1][k] = buffer; 
            }
        }
    }
    for (int j = 0; j<11; j++) {
        for (int k = 0; k < array[2].length; k++){
            if (array[2][j] < array[2][k]) {
                int buffer = array[2][j];
                array[2][j] = array[2][k];
                array[2][k] = buffer; 
            }
        }
    }
    for (int j = 0; j<14; j++) {
        for (int k = 0; k < array[3].length; k++){
            if (array[3][j] < array[3][k]) {
                int buffer = array[3][j];
                array[3][j] = array[3][k];
                array[3][k] = buffer; 
            }
        }
    }
    for (int j = 0; j<17; j++) {
        for (int k = 0; k < array[4].length; k++){
            if (array[4][j] < array[4][k]) {
                int buffer = array[4][j];
                array[4][j] = array[4][k];
                array[4][k] = buffer; 
            }
        }
    }
    //print sorted array
    for (int k = 0; k < array.length; k++) {
            for (int m = 0; m < array[k].length; m++) {
                System.out.print(array[k][m] + " ");
            }
            System.out.print("\n");
        }
        System.out.println();
    //copy array
    int[][] newArray = new int [5][17];
    for (int k = 0; k < 5; k++) {
            for (int m = 0; m < array[k].length; m++) {
                newArray[k][m] = array[k][m];
            }
            for (int m = array[k].length; m<17; m++){
                newArray[k][m] = 0;
            }
    }
    
    //print array
    for (int k = 0; k < 5; k++) {
            for (int m = 0; m < 17; m++) {
                System.out.print(newArray[k][m] + " ");
            }
            System.out.print("\n");
        }

    
}
}
