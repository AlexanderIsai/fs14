package lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) {
        // create array
        char[] arr = {'a', 'b', 'c', 'd', 'e'};

        // iterate and store string value
        String str = "";
        for (int i = 0; i < 6; i++) {
            int value = ThreadLocalRandom.current().nextInt(arr.length);
            str += arr[value];
        }
        // method execution
        System.out.println(str);
        System.out.println(isDuplicateExist(str));

    }

    static boolean isDuplicateExist(String value) {
        // implementation
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

}
