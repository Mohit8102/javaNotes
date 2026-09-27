import java.sql.SQLOutput;

import java.util.*;

public class first{
    public static void main(String[] args) {
//output
        System.out.print("Hello");
        System.out.println("Hello");
        System.out.print("Hello\n");

        System.out.println("*\n**\n***");
//variables
        String name = "tonny";
        float b = 7.9f;
        int a = 10;
        a = 50;
        System.out.println(a);
//operator
        int c = 20;
        int d = 13;
        int sum = c + d;
        System.out.println(sum);
//input
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();  //nextLine, nextInt, nextFloat
        System.out.print(Name);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int Sum = num1 + num2;
        System.out.println(Sum);
    }
}