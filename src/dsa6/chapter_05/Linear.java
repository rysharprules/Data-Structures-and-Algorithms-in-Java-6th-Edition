package dsa6.chapter_05;

public class Linear {

    /**
     * Returns the sum of the first n integers of the given array.
     */
    public static int linearSum(int[] data, int n) {
        if (n == 0)
            return 0;
        else
            return linearSum(data, n - 1) + data[n - 1];
    }

    /**
     * Reverses the contents of subarray data[low] through data[high] inclusive.
     */
    public static void reverseArray(int[] data, int low, int high) {
        if (low < high) { // if at least two elements in subarray
            int temp = data[low]; // swap data[low] and data[high]
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high - 1); // recur on the rest
        }
    }

    /**
     * Computes the value of x raised to the nth power, for nonnegative integer n.
     * O(n)
     */
    public static double power(double x, int n) {
        if (n == 0)
            return 1;
        else
            return x * power(x, n - 1);
    }

    /**
     * Computes the value of x raised to the nth power, for nonnegative integer n.
     * Faster due to squaring technique
     *
     * power(x,n) =
     *              { 1                         if n = 0
     *              { power(x,n/2)squared*x     if n > 0 is odd
     *              { power(x,n/2)squared       if n > 0 is even
     * O(log n)
     */
    public static double powerFaster(double x, int n) {
        if (n == 0)
            return 1;
        else {
            double partial = power(x, n / 2); // rely on truncated division of n
            double result = partial * partial;
            if (n % 2 == 1) // if n odd, include extra factor of x
                result *= x;
            return result;
        }
    }
}
