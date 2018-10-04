package dsa6.chapter_04;

public class NLogN {

    // The running time grows in proportion to n log n of the input:
    // O(n log n)
    public static void nLogN(int n) {
        for (int i = 1; i <= n; i++){
            for(int j = 1; j < 8; j = j * 2) {
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
    }
}
