package L08;

import java.util.NoSuchElementException;

public class MyQueue<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] obj;
    private int size;
    private int indexToInsert;
    private int indexToRemove;

    public MyQueue() {
        this.obj = new Object[DEFAULT_CAPACITY];
        this.size = 0;
        this.indexToInsert = 0;
        this.indexToRemove = 0;
    }

    public MyQueue(int size) {
        if (size < 0)
            throw new IllegalArgumentException();
        this.obj = new Object[size];
        this.size = 0;
        this.indexToInsert = 0;
        this.indexToRemove = 0;
    }

    public boolean add(E o) {
        if (obj.length == size)
            return false;

        obj[indexToInsert] = o;
//        indexToInsert = (indexToInsert == obj.length) ? 0 : indexToInsert + 1;
        indexToInsert = (indexToInsert + 1) % obj.length;
        size++;
        return true;

    }

    public E remove() {
        if (size == 0)
            throw new NoSuchElementException();

        E item = (E) obj[indexToRemove];
        obj[indexToRemove] = null;
        indexToRemove = (indexToRemove + 1) % obj.length;
        size--;
        return item;

    }

    public E peek() {
        if (size == 0)
            throw new NoSuchElementException();

        E item = (E) obj[indexToRemove];
        return item;

    }

    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        int size = this.size;

        for (int i = indexToRemove; size != 0; i = (i + 1) % obj.length, size--) {
            s.append(obj[i]+((size==1)?"":", "));
        }
        s.append("]");

        return s.toString();
    }


}

