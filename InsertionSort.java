package algorithms;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InsertionSort {


    public static void main(String[] args) {

        int[] array = new int[100000];

        //Generate a reverse sorted array
        for (int i = array.length, j = 0; i > 0; --i) {
            array[j++] = i;
        }

        try(PrintWriter out = new PrintWriter(new FileWriter(new File("C:\\Users\\nitesh\\sorting.txt")))) {

            out.println("\r\n\r\nCase 1: Sorting descending array:\r\n");
            out.println("\r\n\r\nArray before sorting :\r\n");
            print(array, out);

            long checkPointOne = System.currentTimeMillis();
            sort(array);
            long checkPointTwo = System.currentTimeMillis();

            out.println("\r\n\r\nArray after sorting :\r\n\r\n");
            print(array, out);

            randomize(array);

            out.println("\r\n\r\n\r\nCase 2: Sorting random array:\r\n");
            out.println("\r\nArray before sorting :\r\n");
            print(array, out);

            long checkPointThree = System.currentTimeMillis();
            sort(array);
            long checkPointFour = System.currentTimeMillis();


            out.println("\r\n\r\nArray after sorting :\r\n");
            print(array, out);

            out.println("\r\n\r\n");
            out.print("\r\nTime to sort descending array = " + (checkPointTwo - checkPointOne));
            out.print("\r\nTime to sort random array = " + (checkPointFour - checkPointThree));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void randomize(int[] array) {
        boolean[] unique = new boolean[array.length + 1];
        int length = array.length;
        int random = 1;
        for (int i = 0; i < array.length; ++i) {
            random = (int)Math.ceil(Math.random() * length);

            while (unique[random]) {
                random = (int)Math.ceil(Math.random() * length);
            }
            unique[random] = true;
            array[i] = random;
        }
    }

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int marker = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > marker) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = marker;
        }
    }

    public static void print(int[] array, PrintWriter out) throws IOException {
        for (int i = 0; i < array.length; ++i) {
            out.print(array[i] + " ");
        }
    }
}
