package Lesson3_Stack_And_Queue.Queue;

/**
 * Algorithms and Data Structures.
 * Homework for lesson 3.
 *
 * @author Bogdanov Anton.
 * @version dated June 21, 2018.
 * @link https://github.com/BaklaYner/Homeworks-Algorithms-and-data-structures
 */

public class EmptyQueueException extends RuntimeException {

    public EmptyQueueException() {
        super("Queue is empty!");
    }

    public EmptyQueueException(String msg) {
        super(msg);
    }
}