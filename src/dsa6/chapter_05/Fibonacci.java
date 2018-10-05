package dsa6.chapter_05;

public class Fibonacci {

    /**
     * Returns the nth Fibonacci number (inefficiently).
     * Exponential
     */
    public static long fibonacciBad(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacciBad(n - 2) + fibonacciBad(n - 1);
    }

    /**
     * Returns array containing the pair of Fibonacci numbers, F(n) and F(n-1)
     * O(n)
     */
    public static long[] fibonacciGood(int n) {
        if (n <= 1) {
            long[] answer = {n, 0};
            return answer;
        } else {
            long[] temp = fibonacciGood(n - 1); // returns {Fn-1, Fn-2}
            long[] answer = {temp[0] + temp[1], temp[0]}; // we want {Fn, Fn-1}
            return answer;
        }
    }
}
