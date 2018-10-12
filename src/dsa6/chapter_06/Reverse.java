package dsa6.chapter_06;

import java.util.Arrays;

public class Reverse {
    /**
     * A generic method for reversing an array.
     */
    public static <E> void reverse(E[] a) {
        Stack<E> buffer = new ArrayStack<>(a.length);
        for (int i = 0; i < a.length; i++)
            buffer.push(a[i]);
        for (int i = 0; i < a.length; i++)
            a[i] = buffer.pop();
    }

    /**
     * Tester routine for reversing arrays
     */
    public static void main(String args[]) {
        Integer[] a = {4, 8, 15, 16, 23, 42}; // autoboxing allows this
        String[] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
        System.out.println("Reversing...");
        reverse(a);
        reverse(s);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
    }
}
