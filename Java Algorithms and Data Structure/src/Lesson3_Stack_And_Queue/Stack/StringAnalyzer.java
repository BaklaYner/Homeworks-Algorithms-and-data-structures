package Lesson3_Stack_And_Queue.Stack;

/**
 * Algorithms and Data Structures.
 * Homework for lesson 3.
 *
 * @author Bogdanov Anton.
 * @version dated June 21, 2018.
 * @link https://github.com/BaklaYner/Homeworks-Algorithms-and-data-structures
 */

// Task 1 and 2.
public class StringAnalyzer {
    private String input;
    private Stack<Character> stack;

    public StringAnalyzer(String in) {
        input = in;
        stack = new Stack<Character>(input.length());
    }

    // Task 1.
    public void checkForBraces() {
        char ch, chr;
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                case ']':
                case '}':
                    if (!stack.isEmpty()) {
                        chr = stack.pop();
                        if ((ch == ')' && chr != '(') || (ch == ']' && chr != '[') || (ch == '}' && chr != '{')) {
                            System.out.println("Error: " + ch + " at index " + i);
                        }
                    } else {
                        System.out.println("Error: " + ch + " at index " + i);
                    }
                    break;
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
        stack.clear();
    }

    // Task 2.
    public String reverse() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}