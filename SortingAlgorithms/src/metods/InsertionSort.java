package metods;


import metods.inter.SortAlgorithm;

public class InsertionSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {

        for (int i = 1; i <array.length ; i++) {
            int temp = array[i];
            int j = i-1;
            while (j>=0 && array[j]>temp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1] = temp;
        }


    }
}
