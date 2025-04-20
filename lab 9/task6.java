import java.util.Scanner;
class task6{
public static void generateAndCountRandoms() {
    Random rand = new Random();
    int[] count = new int[21]; // From 0 to 20

    for (int i = 0; i < 100; i++) {
        int num = rand.nextInt(21); // 0 to 20
        count[num]++;
    }

    for (int i = 0; i <= 20; i++) {
        System.out.println("Number " + i + ": " + count[i] + " times");
    }
}
}