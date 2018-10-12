package dsa6.chapter_06;

import dsa6.chapter_03.SinglyLinkedList;

public class LinkedStack<E> implements Stack<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>(); // an empty list

    public LinkedStack() {
    } // new stack relies on the initially empty list

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(E element) {
        list.addFirst(element);
    }

    public E top() {
        return list.first();
    }

    public E pop() {
        return list.removeFirst();
    }
}
