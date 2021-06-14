package lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class App {
    private static final char[] ARR = {'a', 'b', 'c', 'd', 'e'};

    public static void main(String[] args) {
        // create array
        // iterate and store string value
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int value = ThreadLocalRandom.current().nextInt(ARR.length);
            str.append(ARR[value]);
        }
        // method execution
        System.out.println(str);
        System.out.println(isDuplicateExist(str.toString()));
        printValues(str.toString());


        System.out.println(Long.MAX_VALUE);

        Object[] objects = {"1", 1};
        for (Object object : objects) {
            System.out.println(object);
        }

        char c = 'A';
        System.out.println("3.5" + c);


    }

    static boolean isDuplicateExist(String value) {
        for (int i = 0; i < value.length(); i++) {
            char temp = value.charAt(i);
            for (int j = i + 1; j < value.length(); j++) {
                if (temp == value.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    static void printValues(String value) {
        int[] valueCounter = new int[ARR.length];
        String values = String.valueOf(ARR);
        for (char c : value.toCharArray()) {
            valueCounter[values.indexOf(c)]++;
        }
        for (int i = 0; i < valueCounter.length; i++) {
            int counter = valueCounter[i];
            if (counter > 0) {
                System.out.println(ARR[i] + " = " + counter);
            }
        }
    }

}
