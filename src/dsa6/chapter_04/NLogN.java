package dsa6.chapter_04;

public class Linear {

    // The simple algorithm presented above will grow linearly with the size of its input.
    // O(n)
    public static void linear(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hey - I'm busy looking at: " + i);
        }
    }
}
