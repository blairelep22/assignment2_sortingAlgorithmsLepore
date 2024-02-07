import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Performance {
    public static void main(String[] args) throws IOException {

        //printwriter "how to" from stack overflow
        PrintWriter fileOut = new PrintWriter(new FileWriter("hello.txt"));

        SortingAlgorithm bubbleSort = new bubbleSort();
        SortingAlgorithm insertionSort = new insertionSort();
        SortingAlgorithm mergeSort = new mergeSort();
        SortingAlgorithm quickSort = new quickSort();
        SortingAlgorithm selectionSort = new selectionSort();
        SortingAlgorithm shellSort = new shellSort();

        int[] sizeArr = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        SortingAlgorithm[] saArray = { insertionSort, mergeSort, quickSort, selectionSort, shellSort, bubbleSort };

        for (SortingAlgorithm sa : saArray) {
            fileOut.println("Sorting Algorithm: " + sa);
            System.out.println("Sorting Algorithm: " + sa);
            for (int j : sizeArr) {
                tester theTest = new tester(sa);
                fileOut.println(theTest.test(20, j));
                System.out.println(theTest.test(20, j));


            }
        }

        // Close the file writer
        fileOut.close();
    }
}
