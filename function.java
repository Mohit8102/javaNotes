import java.util.*;

public class function {
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//    }
//----------------------------------------------------------------------------------------------------------------------
//    public static int calculateSum(int a, int b){
//        int sum = a + b;
//        return sum;
//    }
//----------------------------------------------------------------------------------------------------------------------
//    public static int product(int a, int b){
//        return a*b;
//    }
//----------------------------------------------------------------------------------------------------------------------
        public static int factorial(int n){
            if(n == 0 || n == 1){
                return 1;
            }else {
                int product = 1;
                for(int i = n; i>= 1; i--){
                    product = product*i;
                }
                return product;
            }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
//----------------------------------------------------------------------------------------------------------------------
//        String name = sc.next();
//
//        printMyName(name);
//----------------------------------------------------------------------------------------------------------------------
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = calculateSum(a, b);
//        System.out.print("sum of 2 no is "+sum);
//----------------------------------------------------------------------------------------------------------------------
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//
//            int multiply = product(a, b);
//            System.out.println(a+" x "+b+" = "+multiply);
//----------------------------------------------------------------------------------------------------------------------
            int n = sc.nextInt();
            int factorial = factorial(n);
            System.out.println(factorial);
    }
}
