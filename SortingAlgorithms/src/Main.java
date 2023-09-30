import metods.SortAlgorithm;
import metods.impl.BubbleSort;
import metods.impl.MergeSort;
import metods.impl.QuickSort;

public class Main {
    public static void main(String[] args) {


        int[] testArray = {8, 6, 10, 3, 4, 9, 6, 3};
        int[] testArray2 = {16, 2, 4, 18, 6, 10, 151, 18, 12, 8, 14, -99, 99};
        int[] testArray3 = {14, 12, 10};

        QuickSort quickSort = new QuickSort();
        quickSort.sort2(testArray2, 0, testArray2.length - 1);

        for (int arr : testArray2) {
            System.out.print(arr + " ");
        }
    }
}