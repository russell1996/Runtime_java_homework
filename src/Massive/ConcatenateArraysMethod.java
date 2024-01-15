package Massive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenateArraysMethod {
    static int[] concatenateArrays(int[] array1, int[] array2) {
        int [] array3 = new int[array1.length  + array2.length];
        int count = 0;

        for(int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            count++;
        }
        for(int j = 0; j < array2.length;j++) {
            array3[count++] = array2[j];
        }
        return array3;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {7, 8, 9, 10, 11, 12};
        int[] average = concatenateArrays(array1,array2);
        System.out.println(Arrays.toString(average));
    }
}
