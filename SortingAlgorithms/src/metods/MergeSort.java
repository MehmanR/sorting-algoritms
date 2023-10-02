package metods;


import metods.inter.SortAlgorithm;

public class MergeSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        //     int[] testArray = {8,6,10,4,9};
        if (array.length <= 1) {
            return;
        }

        int midIndex = array.length / 2;
        int[] leftArray = new int[midIndex]; //length 2
        int[] rightArray = new int[array.length - midIndex];  // length 5-2 = 3

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[i];
        }
        for (int i = midIndex; i < array.length; i++) { //mid - 2
            rightArray[i - midIndex] = array[i];
        }

        sort(leftArray);
        sort(rightArray);
        merge(array, leftArray, rightArray);
    }

    private void merge(int[] array, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] > rightArray[j]) {
                array[k] = rightArray[j++];
            } else {
                array[k] = leftArray[i++];
            }
            k++;
        }
        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }
}
