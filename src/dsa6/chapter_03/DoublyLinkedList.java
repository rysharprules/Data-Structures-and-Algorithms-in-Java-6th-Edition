package dsa6.chapter_03;

public class DoublyLinkedList<E> {

    private static class Node<E> {

        private E element; // ref to the element stored at this node
        private Node<E> prev; // ref to the prev node in the list
        private Node<E> next; // ref to the subsequent node in the list

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            next = n;
            prev = p;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> p) {
            prev = p;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> header; // header sentinel
    private Node<E> trailer; // trailer sentinel
    private int size = 0; // number of nodes in the list

    public DoublyLinkedList() {
        header = new Node<>(null, null, null); // create header
        trailer = new Node<>(null, header, null); // trailer is preceded by header
        header.setNext(trailer); // header is followed by trailer
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() { // returns but does not remove the first element
        if (isEmpty()) return null;
        return header.getNext().getElement(); // first element is beyond header
    }

    public E last() { // returns but does not remove the last element
        if (isEmpty()) return null;
        return trailer.getPrev().getElement(); // last element is before trailer
    }

    public void addFirst(E e) { // adds element e to the front of the list
        addBetween(e, header, header.getNext()); // place just after the header
    }

    public void addLast(E e) { // adds element e to the end of the list
        addBetween(e, trailer.getPrev(), trailer); // place just before the trailer
    }

    public E removeFirst() { // removes and returns the first element
        if (isEmpty()) return null; // nothing to remove
        return remove(header.getNext()); // first element is beyond header
    }

    public E removeLast() {
        if (isEmpty()) return null;
        return remove(trailer.getPrev()); // last element is before the trailer
    }

    /**
     * Adds element e to the linked list in between the given nodes.
     */
    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
        // create and link a new node
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    /**
     * Removes the given node from the list and returns its element.
     */
    private E remove(Node<E> node) {
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }

}
