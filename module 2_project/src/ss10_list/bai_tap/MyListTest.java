package ss10_list.bai_tap;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> numString = new MyList<>(8);

        numString.add(7);
        numString.add(6);
        numString.add(5);
        numString.add(4);
        numString.add(3);
        numString.add(1);

        System.out.println("Element [" + numString.indexOf(7) + " ]has value: " + numString.get(numString.indexOf(7)));
        show(numString);

        numString.add(3, 10);
        System.out.println("After add element 3 with value 10: ");
        show(numString);

        System.out.println("Is there any elememnt has value '2'? " + numString.contains(2));

        System.out.println("After delete element 2: ");
        numString.remove(2);
        show(numString);

        numString.clear();
        System.out.println("After clear: ");
        show(numString);

    }

    public static void show(MyList T) {
        if (T.size() == 0) {
            System.out.println("Nothing to show");
            return;
        }
        for (int i = 0; i < T.size(); i++) {
            System.out.print("\t" + T.get(i));
        }
        System.out.println("\n");
    }
}
