public class insertionSort implements SortingAlgorithm {


    //from textbook example
    public int[] sorty(int[] input){
        for (int i = 1; i < input.length; i++) {
            int j = i;
            while (j > 0 && input[j] < input[j - 1]) {
                // Swap input[j] and input [j - 1]
                int temp = input[j];
                input[j] = input[j - 1];
                input[j - 1] = temp;
                j--;
            }
        }
        return input;
    }

    public String toString() {
        return "Insertion Sort";
    }
}


