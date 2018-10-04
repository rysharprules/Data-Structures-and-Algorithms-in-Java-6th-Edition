package dsa6.chapter_04;

public class Polynomial {

    // O(n2) (quadratic) is faster than O(n3) (cubic) which is faster than O(n4), etc.
    // O(n3)
    public static void polynomial(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
    }
}
