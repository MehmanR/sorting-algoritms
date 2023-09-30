import metods.SortAlgorithm;
import metods.impl.MergeSort;

public class Main {
    public static void main(String[] args) {


        int[] testArray = {8, 6, 10, 4, 9, 3};
        int[] testArray2 = {16, 2, 4, 6, 10, 151,18, 12, 8, 14,-99, 99};
        int[] testArray3 = {14, 12, 10};

        SortAlgorithm sortAlgorithm = new MergeSort();
        sortAlgorithm.sort(testArray2);

        for (int arr : testArray2) {
            System.out.print(arr + " ");
        }
    }
}