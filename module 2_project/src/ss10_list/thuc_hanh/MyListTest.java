package ss10_list.thuc_hanh;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listOfBach=new MyList<Integer>();
        listOfBach.add(1);
        listOfBach.add(2);
        listOfBach.add(3);
        listOfBach.add(4);
        listOfBach.add(5);

        System.out.println("element 3:"+ listOfBach.get(3));
        System.out.println("element 2:"+ listOfBach.get(2));
        System.out.println("element 4:"+ listOfBach.get(4));
        System.out.println("element 1:"+ listOfBach.get(1));

        listOfBach.add(-1);
        System.out.println("element -1:"+ listOfBach.get(-1));// Lỗi vì ko tồn tại index=-1.
    }
}
