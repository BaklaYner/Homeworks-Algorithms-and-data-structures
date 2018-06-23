package Lesson3_Stack_And_Queue.Deque;

import Lesson3_Stack_And_Queue.Queue.EmptyQueueException;

/**
 * Algorithms and Data Structures.
 * Homework for lesson 3.
 * <p>
 * A circular collection that supports element insertion and removal at
 * both ends. Deque is based on array.
 *
 * @author Bogdanov Anton.
 * @version dated June 23, 2018.
 * @link https://github.com/BaklaYner/Homeworks-Algorithms-and-data-structures
 */

// Task 3.
public class Deque<T> {
    private Object[] arr;
    private int head, tail, size;

    public Deque(int size) {
        arr = new Object[size];
        head = arr.length;
        tail = -1;
        this.size = 0;
    }

    /**
     * Inserts the not null element at the front of the deque if it is not full.
     *
     * @param ob the element to add.
     * @return {@code true} if the element was added to this deque, else {@code false}.
     */
    public boolean addFirst(T ob) {
        if (ob != null && !isFull()) {
            if (head == 0) {
                head = arr.length;
            }
            arr[--head] = ob;
            size++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Inserts the not null element at the end of the deque if it is not full.
     *
     * @param ob the element to add.
     * @return {@code true} if the element was added to this deque, else {@code false}.
     */
    public boolean addLast(T ob) {
        if (ob != null && !isFull()) {
            if (tail == arr.length - 1) {
                tail = -1;
            }
            arr[++tail] = ob;
            size++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retrieves and removes the first element of this deque.
     *
     * @return the head of this deque.
     */
    public T removeFirst() {
        if (!isEmpty()) {
            if (head == arr.length) {
                head = 0;
            }
            T tmp = (T) arr[head++];
            size--;
            return tmp;
        } else {
            throw new EmptyQueueException("Deque is empty");
        }
    }

    /**
     * Retrieves and removes the last element of this deque.
     *
     * @return the tail of this deque.
     */
    public T removeLast() {
        if (!isEmpty()) {
            if (tail == -1) {
                tail = arr.length - 1;
            }
            T tmp = (T) arr[tail--];
            size--;
            return tmp;
        } else {
            throw new EmptyQueueException("Deque is empty");
        }
    }

    /**
     * Retrieves, but does not remove, the first element of this deque.
     *
     * @return the head of this deque.
     */
    public T peekFirst() {
        if (!isEmpty()) {
            if (head == arr.length) {
                return (T) arr[0];
            }
            return (T) arr[head];
        } else {
            throw new EmptyQueueException("Deque is empty");
        }
    }

    /**
     * Retrieves, but does not remove, the last element of this deque.
     *
     * @return the tail of this deque.
     */
    public T peekLast() {
        if (!isEmpty()) {
            if (tail == -1) {
                return (T) arr[arr.length - 1];
            }
            return (T) arr[tail];
        } else {
            throw new EmptyQueueException("Deque is empty");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Deque: { ");

        if (!isEmpty()) {
            if (tail > head) {
                for (int i = head; i <= tail; i++) {
                    result.append(arr[i]).append(" ");
                }
            } else {
                for (int i = head; i < arr.length; i++) {
                    result.append(arr[i]).append(" ");
                }
                for (int i = 0; i <= tail; i++) {
                    result.append(arr[i]).append(" ");
                }
            }
        }

        result.append("}");
        return result.toString();
    }

    /**
     * Returns {@code true} if this deque is full (quantity of elements in this deque is equal to size of inner array).
     *
     * @return {@code true} if this deque is full, else {@code false}.
     */
    public boolean isFull() {
        return size == arr.length;
    }

    /**
     * Returns {@code true} if this deque is empty (there are 0 elements in this deque).
     *
     * @return {@code true} if this deque is empty, else {@code false}.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns quantity of elements in this deque.
     *
     * @return quantity of elements in this deque.
     */
    public int getSize() {
        return size;
    }

    /**
     * Clears the deque.
     */
    public void clear() {
        head = arr.length;
        tail = -1;
        size = 0;
    }
}