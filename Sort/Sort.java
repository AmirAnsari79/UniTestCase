//amir hossein ansari
package Exercise_Test_5;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Sort {

    public static void sort(int[] array) {

        if (array.length < 1)
            return;
        int len_left = 0;
        if (array.length == 1) {
            len_left = array.length / 2;
        } else if (array.length % 2 != 0) {
            len_left = (int) Math.ceil(array.length / 2f);
        } else {
            len_left = array.length / 2;
        }

        int[] left = new int[len_left];
        int[] right = new int[array.length / 2];

        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, len_left, right, 0, right.length);

        sort(left);
        sort(right);

        int left_i = 0;
        int right_i = 0;
        int insert_i = 0;

        while (left_i < left.length && right_i < right.length) {
            array[insert_i++] =
                    (left[left_i] <= right[right_i]) ? left[left_i++] : right[right_i++];
        }

        while (left_i < left.length) {
            array[insert_i++] = left[left_i++];
        }

        while (right_i < right.length) {
            array[insert_i++] = right[right_i++];
        }

    }

}

