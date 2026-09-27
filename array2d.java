import java.util.*;

public class array2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

//        int rows = sc.nextInt();
//        int columns = sc.nextInt();
//        int [][] numbers = new int [rows][columns];
//
//        for(int i=0; i<rows; i++){
//            for(int  j=0; j<columns; j++){
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i=0; i<rows; i++){
//            for(int j=0; j<columns; j++){
//                System.out.print(numbers[i][j]);
//            }
//            System.out.println();
//        }
//----------------------------------------------------------------------------------------------------------------------
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.print("which no you want to search: ");
        int num = sc.nextInt();
        boolean found = false;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(array[i][j] == num){
                    System.out.print("row "+(i+1)+" column "+(j+1));
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("Not found!");
        }
    }
}
