package Lesson3_Stack_And_Queue.Queue;

/**
 * Algorithms and Data Structures.
 * Homework for lesson 3.
 *
 * @author Bogdanov Anton.
 * @version dated June 21, 2018.
 * @link https://github.com/BaklaYner/Homeworks-Algorithms-and-data-structures
 */

// Task 1.
public class Queue<T> {
    private Object[] arr;
    private int head, tail, size;

    public Queue(int size) {
        arr = new Object[size];
        head = tail = this.size = 0;
    }

    public boolean insert(T ob) {
        if (ob != null && !isFull()) {
            arr[tail++] = ob;
            if (tail == arr.length) {
                tail = 0;
            }
            size++;
            return true;
        } else {
            return false;
        }
    }

    public T remove() {
        if (!isEmpty()) {
            size--;
            T tmp = (T) arr[head++];
            if (head == arr.length) {
                head = 0;
            }
            return tmp;
        } else {
            return null;
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return (T) arr[head];
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Queue: { ");
        if (!isEmpty()) {
            if (tail > head) {
                for (int i = head; i < tail; i++) {
                    result.append(arr[i]).append(" ");
                }
            } else {
                for (int i = head; i < arr.length; i++) {
                    result.append(arr[i]).append(" ");
                }
                for (int i = 0; i < tail; i++) {
                    result.append(arr[i]).append(" ");
                }
            }
        }
        result.append("}");

        return result.toString();
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        head = tail = size = 0;
    }
}