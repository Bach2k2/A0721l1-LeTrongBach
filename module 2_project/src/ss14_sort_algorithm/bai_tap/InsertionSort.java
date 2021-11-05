package ss14_sort_algorithm.bai_tap;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            System.out.printf("\nLần thứ %d: ",i);
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
            display(array);
        }
    }
    public static void main(String[] args) {
        insertionSort(list);
    }
    public static void display(int [] array)
    {
        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
}
