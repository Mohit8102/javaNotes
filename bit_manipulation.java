import java.util.*;

public class bit_manipulation {
    public static void main(String args[]){
//-----------------------------------------get bit----------------------------------------------------------------------
//        int n = 5;
//        int pos = 2;
//        int bitMask = n << pos;
//
//        if((bitMask & n) == 0){
//            System.out.println("bit no is 0");
//        }else{
//            System.out.println("bit no is 1");
//        }
//-----------------------------------------set bit----------------------------------------------------------------------
//        int n = 5;
//        int pos = 1;
//        int bitMask = 1 << pos;
//
//        int setBit = bitMask | n;
//        System.out.println(setBit);
//-----------------------------------------clear bit--------------------------------------------------------------------
//        int n = 5;
//        int pos = 2;
//        int bitMask = 1 << pos;
//
//        int not_bitMask = ~bitMask;
//
//        int clearBit = not_bitMask & n;
//        System.out.println(clearBit);
//-----------------------------------------update bit-------------------------------------------------------------------
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;
        int not_bitMask = ~bitMask;

        Scanner sc = new Scanner(System.in);
        int updateNo = sc.nextInt();

        if(updateNo == 1){
            int newNo = bitMask | n;
            System.out.println(newNo);
        }if(updateNo == 0){
            int newNo = not_bitMask & n;
            System.out.println(newNo);
        }

    }
}
