import java.util.*;

public class stringbuilder {
    public static void main(String args[]) {
//        StringBuilder sb = new StringBuilder("mohit");
//        System.out.println(sb);
//
//        System.out.println(sb.length());
//        System.out.println(sb.charAt(2));
//
//        sb.setCharAt(0, 'r');
//        System.out.println(sb);
//
//        sb.insert(1, 'o');
//        System.out.println(sb);
//
//        sb.delete(1, 2);
//        System.out.println(sb);
//
//        sb.append("tt");
//        System.out.println(sb);

//----------------------------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder(name);

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
