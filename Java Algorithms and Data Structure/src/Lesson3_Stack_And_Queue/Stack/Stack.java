package Lesson3_Stack_And_Queue.Stack;

import java.util.EmptyStackException;

/**
 * Algorithms and Data Structures.
 * Homework for lesson 3.
 *
 * @author Bogdanov Anton.
 * @version dated June 21, 2018.
 * @link https://github.com/BaklaYner/Homeworks-Algorithms-and-data-structures
 */

// Task 1.
public class Stack<T> {
    private Object[] arr;
    private int size;

    Stack(int size) {
        arr = new Object[size];
        this.size = 0;
    }

    boolean push(T ob) {
        if (ob != null && size < arr.length) {
            arr[size++] = ob;
            return true;
        } else {
            return false;
        }
    }

    T pop() {
        if (size > 0) {
            return (T) arr[--size];
        } else {
            throw new EmptyStackException();
        }
    }

    public T peek() {
        if (size > 0) {
            return (T) arr[size - 1];
        } else {
            throw new EmptyStackException();
        }
    }

    boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    void clear() {
        size = 0;
    }
}