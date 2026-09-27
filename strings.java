import java.util.*;

public class strings {
    public static void main(String args[]){
//        String name = "mohit kumar";
//        System.out.println(name);

//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println(name);
//---------------------------------------------concatenation------------------------------------------------------------
        String firstName = "mohit";
        String lastName = "kumar";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println(fullName.length()-1);

        System.out.println(fullName.charAt(4));

        if(firstName.compareTo(lastName) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are NOT equal");
        }

        String name = firstName.substring(0,5);
        System.out.println(name);
        String Name = firstName.substring(1,firstName.length());
        System.out.println(Name);

        
    }

}
