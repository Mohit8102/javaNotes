public class recursion {
//    public static void printNo(int n){
//        if (n == 5){
//            return;
//        }
//        System.out.println(n);
//        printNo(n+1);
//    }
//    public static void main(String args[]){
//        int n = 1;
//        printNo(n);
//    }
//----------------------------------------------------------------------------------------------------------------------
//    public static void printSum(int i, int n, int sum){
//        if(i == n){
//            sum += i;
//            System.out.println(sum);
//            return;
//        }
//        sum = sum + i;
//        printSum(i+1, n, sum);
//
//    }
//
//    public static void main(String arg[]){
//        int n = 10;
//            printSum(1, 5, 0);
//        }
//----------------------------------------------------------------------------------------------------------------------
//    public static int factorial(int n){
//        if(n == 1 || n == 0){
//            return 1;
//        }
//
//        int fac_n = n * factorial(n-1);
//        return fac_n;
//
//    }
//    public static void main(String arg[]){
//        int ans = factorial(5);
//        System.out.println(ans);
//    }
//----------------------------------------------------------------------------------------------------------------------
    public static void calFab(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        calFab(b, c, n-1);
    }
    public static void main(String arg[]){
       int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 10;
        calFab(a, b, n-2);
    }
}
