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
public class PriorityQueue {
    private int[] arr;
    private int size;

    public PriorityQueue(int size) {
        arr = new int[size];
        this.size = 0;
    }

    public boolean insert(int value) {
        if (isFull()) return false;
        if (isEmpty()) {
            arr[size++] = value;
        } else {
            int i;
            for (i = size - 1; i >= 0; i--) {
                if (value < arr[i]) {
                    break;
                }
            }
            System.arraycopy(arr, i + 1, arr, i + 2, size - 1 - i);
            arr[i + 1] = value;
            size++;
        }
        return true;
    }

    public int remove() {
        if (!isEmpty()) {
            return arr[--size];
        } else {
            throw new EmptyQueueException();
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[size - 1];
        } else {
            throw new EmptyQueueException();
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Priority queue: { ");
        for (int i = 0; i < size; i++) {
            result.append(arr[i]).append(" ");
        }
        result.append("}");

        return result.toString();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int getSize() {
        return size;
    }
}