package dsa6.chapter_04;

public class Exponential {

    // O(kn) algorithms will get k times bigger with every additional input.
    // O(kn)
    // This algorithm will run 28 = 256 times.
    public static void polynomial(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
    }
}
