package ss10_list.bai_tap;

class Node {
    Node next;
    Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
public class MyLinkedList<E> {
    public Node head;
    public static int numNodes = 0;



    public MyLinkedList() {
        head = null;
    }

    public void add(int index, E element) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node hold = temp.next;
        temp.next = new Node(element);
        temp.next.next = hold;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = new Node(e);
        if (head == null) {
            head = temp;
            temp.next=null;
        } else {
            Node hold =head;
            temp.next = hold;
            head = temp;
        }
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public void remove(int index) {
        Node temp = head;
        if (index >= numNodes || index < 0) {
            System.out.println("Nằm ngoài danh sách");
            return;
        } else {
            for (int i = 0; i < index - 1; i++) temp = temp.next;
            Node hold = temp.next.next;
            temp.next = hold;
            numNodes--;
        }

    }

    public boolean remove(E e) {
        Node temp = head;
        while (temp != null) {
            if (temp.next.getData() == e) {
                Node hold = temp.next.next;
                temp.next = hold;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public E clone() {
        return (E) head.data;
    }

    public boolean contains(E o) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == o) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        int count = -1;
        Node temp = head;
        while (temp != null && temp == (Node) o) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean add(E e) {
        if (contains(e)) return false;
        else addLast(e);
        return true;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data.toString() + "\t");
            temp = temp.next;
        }
    }

    public E get(int index) {
        if (index == 0) return (E) head.data;
        else {
            Node temp = head;
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
            return (E) temp.data;
        }
    }

}
