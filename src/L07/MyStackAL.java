package L07;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStackAL<E> {

    private ArrayList al;

    public MyStackAL() {
        al = new ArrayList();
    }

    public E push(E item) {
        al.add(item);
        return item;
    }

    public E pop() {
        if (isEmpty())
            throw new EmptyStackException();

        int index = al.size() - 1;
        return (E) al.remove(index);
    }

    public E peek() {
        if (isEmpty())
            throw new EmptyStackException();

        int index = al.size() - 1;
        return (E) al.get(index);
    }

    public boolean isEmpty() {
        return al.isEmpty();
    }

    public int search(Object o) {
        if (isEmpty())
            return -1;

        int index = al.lastIndexOf(o);
        return (index == -1) ? -1 : al.size() - index;
    }


}
