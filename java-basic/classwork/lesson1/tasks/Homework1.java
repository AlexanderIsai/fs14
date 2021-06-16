package lesson1.tasks;
import java.util.concurrent.ThreadLocalRandom;

public class Homework1 {
    private static final char[] arr = {'a', 'b', 'c', 'd', 'e'};
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 6; i++) {
            int value = ThreadLocalRandom.current().nextInt(arr.length);
            str += arr[value];
        }
        System.out.println(str);
        countVal(str);
    }
    static void countVal(String str){
        int[] counterValue = new int[arr.length];
        char[] test = str.toCharArray();
        for (char c : str.toCharArray()){
            counterValue[str.indexOf(c)]++;
        }
        for (int i = 0; i < counterValue.length; i++) {
            int counter = counterValue[i];
            if (counter > 0){
                System.out.println(test[i] + " = " + counter);
            }
        }

    }
}


//package com.firstTesting.testing;
//        import java.util.HashMap;
//        import java.util.concurrent.ThreadLocalRandom;
//public class homework1 {
//    public static void main(String[] args) {
//        char[] arr = {'a', 'b', 'c', 'd', 'e'};
//        int count = 0;
//        String str = "";
//        for (int i = 0; i < 6; i++) {
//            int value = ThreadLocalRandom.current().nextInt(arr.length);
//            str += arr[value];
//        }
//        System.out.println(str);
//        HashMap<String, Integer> letterCount = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            char temp  = str.charAt(i);
//            String test = String.valueOf(temp);
//            for (int j = 0; j < str.length(); j++) {
//                if (temp == str.charAt(j)){
//                    count++;
//                }
//            }
//            letterCount.put(test, count);
//            count = 0;
//        }
//        System.out.println(letterCount);
//    }
//}


