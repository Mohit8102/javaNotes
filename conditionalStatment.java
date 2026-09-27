import java.util.*;

public class conditionalStatment {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age > 18){
//            System.out.println("Adult");
//        }else {
//            System.out.println("Not adult");
//        }
//----------------------------------------------------------------------------------------------------------------------
//           int num = sc.nextInt();
//           if(num % 2 == 0){
//               System.out.println("number is even");
//           }else{
//               System.out.println("number is odd");
//           }
//----------------------------------------------------------------------------------------------------------------------
//            int button = sc.nextInt();
//            if(button == 1){
//                System.out.println("Hello");
//            }else if(button == 2){
//                System.out.println("Namaste");
//            }else if(button == 3){
//                System.out.println("Bonjour");
//            }else{
//                System.out.println("Invalid button");
//            }
//----------------------------------------------------------------------------------------------------------------------
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int button = sc.nextInt();
                switch (button){
                    case 1:
                        System.out.println(num1 + num2);
                        break;
                    case 2:
                        System.out.println(num1 - num2);
                        break;
                    case 3:
                        System.out.println(num1 * num2);
                        break;
                    case 4:
                        System.out.println(num1 / num2);
                        break;
                    case 5:
                        System.out.println(num1 % num2);
                        break;
                    default:
                        System.out.println("Invalid operator");
                }
    }
}
