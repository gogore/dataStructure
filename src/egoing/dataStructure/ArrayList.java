package egoing.dataStructure;

public class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[100];

    public int push(Object element) {
        return add(size, element);
    }

    public Object pop() {
        return remove(size - 1);
    }

    public int shift(Object element) {
        return add(0, element);
    }

    public Object unshift() {
        return remove(0);
    }

    public int add(int $index, Object element) {
        if ($index > size || $index < 0) {
            throw new IndexOutOfBoundsException();
        }
        int index = this.size;
        if (index > 0) {
            do {
                elementData[index] = elementData[index - 1];
            } while (--index > $index);
        }
        elementData[$index] = element;
        return ++this.size;
    }

    public Object remove(int i) {
        if (i > size || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        Object removed = elementData[i].toString();
        while (i < this.size) {
            elementData[i] = elementData[++i];
        }
        elementData[size--] = null;
        return removed;
    }

    public Object get(int i) {
        return elementData[i];
    }

    public int size() {
        return size;
    }

    public int indexOf(Object element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.size; i++) {
            sb.append(elementData[i].toString());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    class ListIterator {
        private int nextIndex = 0;

        public boolean hasNext() {
            return nextIndex < size;
        }

        public Object next() {
            return elementData[nextIndex++];
        }
    }
}
