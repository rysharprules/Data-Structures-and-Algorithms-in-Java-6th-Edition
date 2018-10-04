package dsa6.chapter_04;

public class Logarithmic {

    // Running time grows in proportion to the logarithm
    // O(log n)
    public static void logarithmic(int n) {
        for (int i = 1; i < n; i = i * 2){
            System.out.println("Hey - I'm busy looking at: " + i);
        }
    }
}
