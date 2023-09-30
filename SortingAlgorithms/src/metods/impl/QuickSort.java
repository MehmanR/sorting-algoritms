package metods.impl;

import metods.SortAlgorithm;

public class QuickSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {

    }

    public void sort2(int[] array, int start, int end) {
        if (end <= start) {
            return;
        }
        int pivot = partition(array, start, end);

        sort2(array, start, pivot - 1);
        sort2(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int i = start - 1;
        int pivot = array[end];

        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;


        return i;
    }
}
