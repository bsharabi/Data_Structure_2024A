package L09;

import java.util.*;

public class MyLinkedList<E> implements List<E> {

    private Node<E> head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }


    //O(1)
    @Override
    public int size() {
        return size;
    }

    //O(1)
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    //O(n)
    @Override
    public boolean add(E e) {

        if (head == null) {
            head = new Node<>(e);
        } else {
            Node<E> temp = head;
            while (temp.hasNext())
                temp = temp.getNext();
            temp.setNext(new Node<>(e));
        }
        size++;
        return true;
    }

    //O(n)
    @Override
    public boolean remove(Object o) {

        if (isEmpty())
            return false;

        if (o.equals(head.getValue())) {
            head = head.getNext();
        } else {
            Node<E> current = head.getNext();
            Node<E> prev = head;

            while (current != null) {

                if (o.equals(current.getValue())) {
                    prev.setNext(current.getNext());
                }
                prev = current;
                current = current.getNext();
            }
        }
        size--;
        return true;
    }

    //O(n)
    @Override
    public E remove(int index) {
        if (isEmpty())
            throw new NoSuchElementException();
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        E item = null;
        if (index == 0) {
            item = head.getValue();
            head = head.getNext();
        } else {
            Node<E> current = head.getNext();
            Node<E> prev = head;
            int i = 1;
            while (current != null) {
                if (i == index) {
                    item = current.getValue();
                    prev.setNext(current.getNext());
                }
                prev = current;
                current = current.getNext();
                i++;
            }
        }
        size--;
        return item;
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
        this.head = null;
        this.size = 0;
    }

    @Override
    public E get(int index) {
        if (isEmpty())
            throw new NoSuchElementException();
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        E item = null;
        if (index == 0) {
            item = head.getValue();
        } else {
            Node<E> current = head.getNext();
            int i = 1;
            while (current != null) {
                if (i == index) {
                    item = current.getValue();
                }
                current = current.getNext();
                i++;
            }
        }
        return item;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

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
}
