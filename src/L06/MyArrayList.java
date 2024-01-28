package L06;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] objects;
    private int size;


    public MyArrayList() {
        this.objects = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.objects = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.objects = new Object[DEFAULT_CAPACITY];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
        this.size = 0;
    }


    public boolean add(E e) {
        if (size == objects.length) {
            init();
        }
        objects[size] = e;
        size++;
        return true;
    }

    public boolean remove(Object e) {
        if (isEmpty()) {
            return false;
        }
        int i = 0;
        for (; i < size; i++) {
            if (objects[i] == e)
                break;
        }
        //{1,2,3,4,5,0,0,0,0,9}
        if (i == size)
            return false;

        for (int j = i; j < size - 1; j++) {
            objects[j] = objects[j + 1];
        }
        size--;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        E object = (E) objects[index];
        return object;

    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    private void init() {
        Object[] temp = new Object[objects.length * 2];
        for (int i = 0; i < objects.length; i++) {
            temp[i] = objects[i];
        }
        objects = temp;
    }
}
