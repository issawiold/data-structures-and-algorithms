/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package array.insert.shift;

import java.util.Arrays;

public class Library {

        public static void main(String[] args) {
        }

    public static int[] insertShiftArray(int[] arr, int num) {
        int[] newArr = new int[arr.length + 1];
        newArr = arr(arr, newArr);
        newArr[newArr.length / 2] = num;
        return newArr;
    }

    public static int[] arr(int[] arr, int[] result) {
        for (int i = 0; i < arr.length; i++) {
            if (i < (result.length / 2)) {
                result[i] = arr[i];
            } else {
                result[i + 1] = arr[i];
            }
        }
        return result;
    }

}
