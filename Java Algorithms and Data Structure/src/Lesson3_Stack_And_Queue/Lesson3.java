package Lesson3_Stack_And_Queue;

import Lesson3_Stack_And_Queue.Deque.Deque;
import Lesson3_Stack_And_Queue.Queue.EmptyQueueException;
import Lesson3_Stack_And_Queue.Queue.PriorityQueue;
import Lesson3_Stack_And_Queue.Queue.Queue;
import Lesson3_Stack_And_Queue.Stack.StringAnalyzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Algorithms and Data Structures.
 * Homework for lesson 3.
 *
 * @author Bogdanov Anton.
 * @version dated June 23, 2018.
 * @link https://github.com/BaklaYner/Homeworks-Algorithms-and-data-structures
 */

// Task 1 and 2.
public class Lesson3 {
    public static void main(String[] args) throws EmptyQueueException, IOException {
        testStack();
        System.out.println();

        testQueue();
        System.out.println();

        testPriorityQueue();
        System.out.println();

        testDeque();
    }

    private static void testStack() throws IOException {
        String input;
        StringAnalyzer str;
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nEnter the string to analyze and reverse(Empty for exit): ");
            try {
                input = br.readLine();
            } catch (IOException e) {
                input = "";
                e.printStackTrace();
            }
            if (input.equals("")) break;

            str = new StringAnalyzer(input);
            str.checkForBraces();
            System.out.println("Reversed string: \"" + str.reverse() + "\"");
        }

        br.close();
    }

    private static void testQueue() {
        Queue<Integer> queue = new Queue<>(5);
        queue.insert(11);
        queue.insert(22);
        queue.insert(33);
        queue.insert(44);
        queue.insert(55);
        System.out.println(queue);

        queue.remove();
        queue.remove();
        System.out.println(queue);

        queue.insert(11);
        queue.insert(22);
        System.out.println(queue);
    }

    private static void testPriorityQueue() throws EmptyQueueException {
        PriorityQueue priorQ = new PriorityQueue(5);
        priorQ.insert(33);
        priorQ.insert(55);
        priorQ.insert(11);
        priorQ.insert(44);
        priorQ.insert(22);
        System.out.println(priorQ);

        priorQ.remove();
        priorQ.remove();
        System.out.println(priorQ);

        priorQ.insert(11);
        priorQ.insert(22);
        System.out.println(priorQ);
    }

    private static void testDeque() throws EmptyQueueException {
        Deque<Integer> deque = new Deque<>(5);
        deque.addFirst(33);
        deque.addFirst(22);
        deque.addFirst(11);
        deque.addLast(44);
        deque.addLast(55);
        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);

        deque.addFirst(11);
        deque.addLast(55);
        System.out.println(deque);
    }

}