package Java.WPMCounter;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class wpm_program {
    // 以下のワードリストからランダムでワード出ます。
    static String[] words = { "you", "typing", "are", "at", "everything", "random",
            "hope", "everything", "all", "best", "this",
            "is", "the", "fun", "give", "your", "100%" };

    public static void main(String[] args) throws InterruptedException {
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(words[rand.nextInt(9)] + " ");

        }
        System.out.println();
        TimeUnit.SECONDS.sleep(1);

        double start = LocalTime.now().toNanoOfDay();

        try (Scanner scan = new Scanner(System.in)) {
            String typedWords = scan.nextLine();

            double end = LocalTime.now().toNanoOfDay();
            double elapsedTime = end - start;
            double seconds = elapsedTime / 1000000000.0;
            int numChars = typedWords.length();
            System.out.println(typedWords);

            // ( x characters / 5) / 1min = y WPM

            int wpm = (int) ((((double) numChars / 5) / seconds) * 60);

            System.out.println("Your wpm is " + wpm + "!");
        }
    }
}
