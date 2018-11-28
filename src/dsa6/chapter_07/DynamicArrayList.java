public class DynamicArrayList<E> extends ArrayList<E> {
    /**
     * Resizes internal array to have given capacity >= size.
     */
    protected void resize(int capacity) {
        E[] temp = (E[]) new Object[capacity]; // safe cast; compiler may give warning
        for (int k = 0; k < size; k++)
            temp[k] = data[k];
        data = temp; // start using the new array
    }

    /**
     * Inserts element e to be at index i, shifting all subsequent elements later.
     */
    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException {
        checkIndex(i, size + 1);
        if (size == data.length) // not enough capacity
            resize(2 * data.length); // so double the current capacity
        for (int k = size - 1; k >= i; k--) // start by shifting rightmost
            data[k + 1] = data[k];
        data[i] = e; // ready to place the new element
        size++;
    }
}