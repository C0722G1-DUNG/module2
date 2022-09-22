package ss10.execrise;

import java.util.Arrays;

public class Mylist<E> {

    public Object[] elements;
    private int size = 0;
    private static final int DEAFAULT_CAPACITY = 10;


    public Mylist() {
        elements = new Object[DEAFAULT_CAPACITY];
    }

    public Mylist(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity:" + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index) {
        if (index > elements.length|| index<0) {
            throw new IllegalMonitorStateException("index" + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        }
        else {
            for (int i = size+1; i >=index; i--) {
elements[i]=elements[i-1];
            }
            elements[index]=element;
            size++;
        }
    }

    public void ensureCapacity(int miniCapacyti) {
        if (miniCapacyti >= 0) {
            int newsize = this.elements.length + miniCapacyti;
            elements = Arrays.copyOf(elements, newsize);
        } else {
            throw new IllegalMonitorStateException("miniCâpcyti" + miniCapacyti);
        }
    }
}