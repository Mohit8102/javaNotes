import java.util.*;

public class array {
    public static void main(String args[]){
//        int[] marks = new int[3];
//        int marks[] = new int[3];
//        int marks[] = {21,32,34};
//        marks[0] = 21;
//        marks[1] = 32;
//        marks[2] = 34;

//        System.out.println(marks[2]);

//        for(int i = 0; i < 3; i++){
//            System.out.print(marks[i]+", ");
//        }
//----------------------------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//        for(int i=0; i<size; i++){
//            numbers[i] = sc.nextInt();
//        }
//        for(int i=0; i<size; i++){
//            System.out.print(numbers[i]+", ");
//        }
//----------------------------------------------------------------------------------------------------------------------
        System.out.print("Enter the size of your array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter your no "+(i+1)+": ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("Which no you want to find: ");
        int num = sc.nextInt();
        for(int i=0; i<size; i++){
            if(num == numbers[i]){
                System.out.print("Number "+num+" is at "+(i+1)+" place");
            }else{
                System.out.println("Number "+num+" is not in your array");
                break;
            }
        }
    }
}
