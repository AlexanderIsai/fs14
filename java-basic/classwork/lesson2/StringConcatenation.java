package lesson2;

public class StringConcatenation {

    public static void main(String[] args) throws InterruptedException {
//        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuilder = new StringBuffer();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                stringBuilder.append(i % 9);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                stringBuilder.append(i % 9);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(stringBuilder.length());
    }

}
