package TestExam6;

import java.util.Arrays;

public class BuggyClass {

    /**
     * This class looks like it's meant to provide a few public static methods
     * for searching and sorting arrays.  It also has a main method that tests
     * the searching and sorting methods.
     * <p>
     * TODO: The search and sort methods in this class contain bugs that can
     * cause incorrect output or infinite loops.  Use the Eclipse debugger to
     * find the bugs and fix them.
     */
    public static void main(String[] args) {

        int[] A = new int[10];  // Create an array and fill it with random ints.
        for (int i = 0; i < 10; i++)
            A[i] = 1 + (int) (10 * Math.random());

        int[] B = A.clone();   // Make copies of the array.
        int[] C = A.clone();

        System.out.print("The array is:");
        printArray(A);

        Arrays.sort(A);  // sort using Java's built-in sort method!
        System.out.print("Sorted by Arrays.sort():  ");
        printArray(A);

        SweepSort(B);
        System.out.print("Sorted by Exchange Sort:     ");
        printArray(B);

        Mergesort(C);
        System.out.print("Sorted by Merge Sort:     ");
        printArray(C);
    }

    /**
     * Sorts an array into non-decreasing order. This inefficient sorting
     * method simply sweeps through the array, exchanging neighboring elements
     * that are out of order.  The number of times that it does this is equal
     * to the length of the array.
     */
    public static void SweepSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) { // swap elements j and j+1
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Outputs the ints in an array on one line, separated by spaces,
     * with a line feed at the end.
     */
    private static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(" ");
            System.out.print(array[i]);
        }

        System.out.println();
    }

    /**
     * A merge sort works as follows:
     * Divide the unsorted list into n sublists, each containing 1 element (a list of 1 element is considered sorted).
     * Repeatedly merge sublists to produce new sorted sublists until there is only 1 sublist remaining.
     * This will be the sorted list.
     */
    public static void Mergesort(int[] array) {

        if (array.length < 1)
            return;

        int[] left = new int[array.length / 2];
        int[] right = new int[array.length / 2];

        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, array.length / 2, right, 0, right.length);

        Mergesort(left);
        Mergesort(right);

        int left_i = 0;
        int right_i = 0;
        int insert_i = 0;

        while (left_i < left.length && right_i < right.length) {
            array[insert_i++] =
                    (left[left_i] <= right[right_i]) ? left[left_i++] : right[right_i++];
        }

        while (left_i <= left.length) {
            array[insert_i++] = left[left_i++];
        }

        while (right_i <= right.length) {
            array[insert_i++] = right[right_i++];
        }

    }
}

