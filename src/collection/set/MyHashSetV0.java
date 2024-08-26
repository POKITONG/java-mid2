package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementDate = new int[10];
    private int size = 0;

    // O(n)
    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }

        elementDate[size] = value;
        size++;
        return true;
    }

    // O(n)
    public boolean contains(int value) {
        for (int data : elementDate) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementDate=" + Arrays.toString(Arrays.copyOf(elementDate, size)) +
                ", size=" + size +
                '}';
    }
}
