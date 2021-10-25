package ss10_list.thuc_hanh.trien_khai_lop_LinkedList_don_gian;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/=Testing/=/=/=");
        MyLinkedList linkedList=new MyLinkedList(10);// Tạo node head gia trị 10
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);

        linkedList.printList();
        System.out.println("\n");
        linkedList.add(4,9);
        linkedList.add(4,9);
        linkedList.printList();
    }
}
