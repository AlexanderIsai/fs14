package lesson2;

import java.util.Arrays;

public class BitwiseOperators {
    public static void main(String[] args) throws NoSuchFieldException {
        String s = "a";
        System.out.println(s.length() + " " + Arrays.toString(s.getBytes()));

        // Initial values
        int a = 5;
        int b = 7;
//
//        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));
//
//        // bitwise or
//         0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));
//
//        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));
//
//        // bitwise not
        // ~0101=1010
//         will give 2's complement of 1010 = -6
        System.out.println("~a = " + ~a);
//
//        // can also be combined with
//        // assignment operator to provide shorthand
//        // assignment
//         a=a&b
        a &= b;
        System.out.println("a= " + a);
//
//        boolean c = get(true) & get(false);
//        System.out.println(c);

        if(get(true) || get(true)){

        }

        System.out.println("next");

        if(get(true) | get(true)){

        }
    }


    static boolean get(boolean value) {
        System.out.println("getting..." + value);
        return value;
    }
}
