package com.company;
import static java.util.Arrays.copyOf;

public class MergeSort {
    public static void mergeSort(int[] arr, int low, int high) {
        if (high <= low) {
            return;
        }
        int middle = low + (high - low) / 2;
        mergeSort(arr, low, middle);
        mergeSort(arr, middle + 1, high);
        int[] buffer = copyOf(arr, arr.length);
        for (int k = low; k <= high; k++) {
            buffer[k] = arr[k];
            int i = low;
            int j = middle + 1;
            for (k = low; k <= high; k++) {
                if (i > middle) {
                    arr[k] = buffer[j];
                    j++;
                } else if (j > high) {
                    arr[k] = buffer[i];
                    i++;
                } else if (buffer[j] < buffer[i]) {
                    arr[k] = buffer[j];
                    j++;
                } else {
                    arr[k] = buffer[i];
                    i++;
                }
            }
        }
    }
}
