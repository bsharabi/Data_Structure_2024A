package L07;

import java.util.EmptyStackException;

public class MyStack<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] obj;
    private int size;

    public MyStack() {
        this.obj = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    //               |
    //[1,2,3,4,5,6,7,8,0,0,0,0,0]
    public E push(E item) {
        if (obj.length == size)
            init();
        obj[size++] = item;
        return item;
    }

    private void init() {
        Object[] temp = new Object[size * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = obj[i];
        }
        obj = temp;
    }


    public E pop() {
        if (isEmpty())
            throw new EmptyStackException();
        E item = (E) obj[size - 1];
        size--;
        return item;
    }


    public E peek() {
        if (isEmpty())
            throw new EmptyStackException();
        E item = (E) obj[size - 1];
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public int search(Object o) {
        if (isEmpty())
            return -1;
        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(obj[i]))
                return size-i;
        }
        return -1;
    }


}
