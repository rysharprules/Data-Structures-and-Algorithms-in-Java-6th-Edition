package dsa6.chapter_03;

public class CircularlyLinkedList<E> {

    private static class Node<E> {

        private E element; // ref to the element stored at this node
        private Node<E> next; // ref to the subsequent node in the list

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> tail = null; // last node of the list (or null if empty)
    private int size = 0; // number of nodes in the list

    public CircularlyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() { // returns but does not remove the first element
        if (isEmpty()) return null;
        return tail.getNext().getElement(); // head is after the tail
    }

    public E last() { // returns but does not remove the last element
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void rotate() { // rotate the first element to the back of the list
        if (tail != null) // do nothing if empty
            tail = tail.getNext(); // old head becomes new tail
    }

    public void addFirst(E e) { // adds element e to the front of the list
        if (size == 0) {
            tail = new Node<>(e, null);
            tail.setNext(tail); // link to itself circularly
        } else {
            Node<E> newest = new Node<>(e, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(E e) { // adds element e to the end of the list
        addFirst(e); // insert e at front of list
        tail = tail.getNext(); // now new element becomes the tail
    }

    public E removeFirst() { // removes and returns the first element
        if (isEmpty( )) return null; // nothing to remove
        Node<E> head = tail.getNext( );
        if (head == tail) tail = null; // must be the only node left
        else tail.setNext(head.getNext( )); // removes head from the list
        size--;
        return head.getElement( );
    }

}
