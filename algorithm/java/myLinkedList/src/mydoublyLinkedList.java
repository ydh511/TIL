public class MyLinkedList<E>{
    private Node<E> head;
    private Node<E> tail;

    private int size = 0;

    public MyLinkedList(){

        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public static class Node<E>{
        private E item;
        private Node<E> next;
        private Node<E> prev;

        Node(Node<E> prev, E item, Node<E> next){
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
public class mydoublyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
    }
}

