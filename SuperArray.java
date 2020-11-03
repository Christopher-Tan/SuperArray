public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray() {
        data = new String[10];
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
        String[] result = new String[size + 10];
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
        size = 0;
        data = new String[10];
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
}