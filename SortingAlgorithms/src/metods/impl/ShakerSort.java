package metods.impl;

import metods.SortAlgorithm;

public class ShakerSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            boolean isSorted = true;
            for (int j = 1; j < array.length; j++) {

                if (array[j-1]>array[j]){
                    isSorted=false;
                    int temp = array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
                // 4  3  2  6
                if (array[array.length-j]<array[array.length-j-1]){
                    int temp = array[array.length-j-1];
                    array[array.length-j-1]=array[array.length-j];
                    array[array.length-j]=temp;
                }

            }
            if (isSorted){
                break;
            }
            System.out.println("------------------------");
            for (int test : array) {
                System.out.print(test + " ");
            }
        }
    }
}
