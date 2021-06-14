package lesson2;

public class Loops {
    public static void main(String[] args) {
        byte a = (byte) 0b1111_1011;
        int x = a << 1;
        System.out.println(Integer.toBinaryString(x));

        byte i = (byte) 0b0111_1011;
        int i1 = i >>> 1; //right unsigned shift (fills with zeros)
        System.out.println(Integer.toBinaryString(i1));
    }
}
