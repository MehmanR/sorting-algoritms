import metods.InsertionSort;
import metods.inter.SortAlgorithm;

public class Main {
    public static void main(String[] args) {


        int[] testArray = {8, 6, 10, 3, 100,4, 9, -6, 13};
        int[] testArray2 = {16, 2, 4, 18, 6, 10, 151, 18, 12, 8, 14, -99, 99};
        int[] testArray3 = {14, 12, 10};

        SortAlgorithm sortAlgorithm =  new InsertionSort();
        sortAlgorithm.sort(testArray);

        for (int arr : testArray) {
            System.out.print(arr + " ");
        }
    }
}