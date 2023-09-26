package file;

import file.inter.FileServiceInter;

import java.io.*;

public class FileService implements FileServiceInter {


    @Override
    public int[] addWordToArray(String fileName) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            int size = 0;
            while (bufferedReader.readLine() != null) {
                size++;
            }
            bufferedReader.close();

            bufferedReader = new BufferedReader(new FileReader(fileName));


            int[] intArray = new int[size];
            int index = 0;

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                int lineNum = Integer.parseInt(line);
                intArray[index] = lineNum;
                index++;
            }
            return intArray;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
