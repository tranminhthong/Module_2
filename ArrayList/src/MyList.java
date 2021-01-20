public class MyList<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {

    }

    public void add(int index, E element) {
        ensureCapa();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    private void ensureCapa() {
        if (size >= elements.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(elements, 0, newData, 0, size);
            elements = newData;
        }
    }

    public E remove(int index) {
        checkIndexOf(index);
        E o = (E) elements[index];
        for (int j = index; j < size - 1; j++)
            elements[j] = elements[j + 1];
        elements[size - 1] = null;
        size--;
        return o;
    }

    public int size() {
        return elements.length;
    }

    public MyList<E> clone() {
        MyList<E> elements1 = new MyList<>() ;
        for (int i = 0; i < size; i++) {
            elements1.add(i, (E) elements[i]);
        }
        return elements1;

    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i]))
                return true;
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i])) return i;
        return -1;
    }

    public void ensureCapacity(int minCapacity) {

    }

    public E get(int index) {
        checkIndexOf(index);
        return (E) elements[index];
    }

    private void checkIndexOf(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }

}
