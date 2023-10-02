package metods;


import metods.inter.SortAlgorithm;

public class BubbleSort implements SortAlgorithm {

    @Override
    public void sort(int[] array) {

        int numOfStep = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 1; j < array.length; j++) {

                if (array[j - 1] > array[j]) {
                    isSorted = false;
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            numOfStep += i;
            if (isSorted) {
                break;
            }
        }
        System.out.println("Number of step : " + numOfStep);
        for (int test : array) {
            System.out.print(test + " ");
        }


    }
}
