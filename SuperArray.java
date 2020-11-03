public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray() {
        data = new String[10];
        size = 0;
    }
    public SuperArray(int initialCapacity) {
        data = new String[initialCapacity];
        size = 0;
    }
    public int size() {
        return size;
    }
    public boolean add(String element) {
        if (size >= data.length) {
            resize();
        }
        data[size] = element;
        size++;
        return true;
    }
    public String get(int index) {
        return data[index];
    }
    public String set(int index, String element) {
        String result = data[index];
        data[index] = element;
        return result;
    }
    private void resize() {
        String[] result = new String[2 * size];
        for (int i = 0; i < size; i++) {
            result[i] = data[i];
        }
        data = result;
    }
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public void clear() {
        data = new String[size];
        size = 0;
    }
    public String toString() {
        String result = "[";
        for (int i = 0; i < size-1; i++) {
            result += data[i] + ", ";
        }
        if (size > 0) {
            result += data[size-1];
        }
        return result + "]";
    }
    public boolean contains(String s) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(s)) {
                return true;
            }
        }
        return false;
    }
    public void add(int index, String element) {
        size++;
        for (int i = size - 1; i >= index + 1; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
    }
    public String remove(int index) {
        String result = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        data[size - 1] = null;
        size--;
        return result;
    }
    public int indexOf(String s) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }
    public String[] toArray() {
        String[] result = new String[size];
        for (int i = 0; i < size; i++) {
            result[i] = data[i];
        }
        return result;
    }
}