package ss10_list.bai_tap;

import java.util.Arrays;

public class MyList <E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private final Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E e) {
        if(index>=0&&index<=size) {
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = e;
            size++;
        }
        else
        {
            System.out.println("Out of bound");
        }
    }

    public void remove(int index) {
        if (size - index >= 0) System.arraycopy(elements, index + 1, elements, index, size - index);
        size--;
    }

    int size() {
        return size;
    }

    public E clone() {
        return (E) elements;
    }

    boolean contains(E o) {
        for(int i=0;i<size;i++)
        {
            if (elements[i]==o) return true;
        }
        return false;
    }

    int indexOf(E o) {
        int index=-1;
        for(int i=0;i<size;i++)
        {
            if(elements[i]==o) return i;
        }
        return index;
    }

    boolean add(E e) {
        if(size==DEFAULT_CAPACITY)
        {
            ensureCapacity(1);
        }
        else
        {
            elements[size]=e;
            size ++;
        }
        return true;
    }

    void ensureCapacity(int minCapacity) {
        Arrays.copyOf(elements,size+minCapacity);
    }

    E get(int i) {
        return (E) elements[i];
    }

    public void clear() {
        size=0;
        Arrays.copyOf(elements,size);
    }
}

