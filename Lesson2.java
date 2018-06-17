/**
 * Algorithms and Data Structures.
 * Homework for lesson 2.
 *
 * @author Bogdanov Anton.
 * @version dated June 17, 2018.
 * @link https://github.com/BaklaYner/Homeworks-Algorithms-and-data-structures
 */

public class Lesson2 {
    public static void main(String[] args) {
        int size = 1_000_000;
        int random;
        long time;

        // Task 1.
        Array bubbleArray = new Array(size);
        Array selectArray = new Array(size);
        Array insertArray = new Array(size);

        // Task 3.
        for (int i = 0; i < size; i++) {
            random = (int) Math.round(Math.random() * 1000);
            bubbleArray.append(random);
            selectArray.append(random);
            insertArray.append(random);
        }

        // Task 4. Bubble sort demonstration.
        time = System.currentTimeMillis();
        bubbleArray.bubbleSort();
        time = System.currentTimeMillis() - time;
        System.out.println("Time for bubbleSort: " + time + " milliSeconds.\n");

        // Task 4. Selection sort demonstration.
        time = System.currentTimeMillis();
        selectArray.selectionSort();
        time = System.currentTimeMillis() - time;
        System.out.println("Time for selectionSort: " + time + " milliSeconds.\n");

        // Task 4. Insertion sort demonstration.
        time = System.currentTimeMillis();
        insertArray.insertionSort();
        time = System.currentTimeMillis() - time;
        System.out.println("Time for insertionSort: " + time + " milliSeconds.\n");

    }
}