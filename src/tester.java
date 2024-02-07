
import java.util.Random;


/*
Write a Tester class to do a performance
comparison of your sorting algorithms. Your Tester class should have at least the following helper
functions:
• Tester(SortingAlgorithm sa): A constructor for the Tester that takes as parameter the sorting
algorithm to be tested
• double singleTest(int size): Should create an array of integers of the given size. Fill it with random
numbers and run the sorting algorithm’s sorty method. It should record and return the time it takes
to sort the array.
• void test(int iterations, int size): Should run the singleTest method as many times as the number of
iterations provided and print to the console the average time the algorithm takes to sort an array of
the given size.
 */
public class tester {

    SortingAlgorithm sa;

    public tester(SortingAlgorithm sa){
        this.sa = sa;
    }


    public double singleTest(int size){
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            int rand = new Random().nextInt();
            arr[i] = rand;
        }

// uncomment for ksort generation
        arr = generateKSorted(arr);

        long startTime = System.nanoTime();
        sa.sorty(arr);
        long endTime = System.nanoTime();
        endTime -= startTime;

        double conversionToMilli = endTime / 1000000.0;
        return conversionToMilli;
    }



    public String test(int iterations, int size){
        double iterationtime = 0;
        for(int i = 0; i<iterations; i++){
            iterationtime += singleTest(size);
        }
        double averageTime = iterationtime / (double)iterations;

        //help from google search for string formatting
        return ("Sorted " + size + " elements in " + String.format("%.10f", averageTime) + " ms (avg)");
    }

    //using shell sort changing gap val
    public int[] generateKSorted(int[] input){
        int n = input.length;

        for (int gap = 10; gap < n; gap++
        ){
            for(int i = gap; i<input.length; i++){
                int tmp = input[i];
                int j = i;
                while(j >= gap && input[j-gap] > tmp){
                    input[j] = input[j-gap];
                    j -= gap;
                }
                input[j] = tmp;
            }
        }
        return input;
    }

}

