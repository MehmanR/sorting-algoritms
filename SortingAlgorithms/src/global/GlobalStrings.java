package global;

import file.FileService;
import file.inter.FileServiceInter;

public class GlobalStrings {

    static FileServiceInter fileServiceInter = new FileService();
    public static final String UN_SORTED_FILE_NAME = "C:\\Users\\User\\OneDrive\\Desktop\\SortingAlgorithms\\SortingAlgorithms\\unSorted-integers.txt";
    public static final String SORTED_FILE_NAME = "sorted-integers.txt";
    public static final int[] INTS_ARRAY =  fileServiceInter.addWordToArray(GlobalStrings.UN_SORTED_FILE_NAME);;


}
