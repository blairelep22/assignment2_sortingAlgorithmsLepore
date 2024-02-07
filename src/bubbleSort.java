public class bubbleSort implements SortingAlgorithm{


    //from textbook
    @Override
    public int[] sorty(int[] input) {
        int tmp;
            for (int i = 0; i < input.length - 1; i++) {
                for (int j = 0; j < input.length - i - 1; j++) {
                    if (input[j] > input[j + 1]) {
                        // Swap numbers[j] and numbers[j + 1]
                        tmp = input[j];
                        input[j] = input[j + 1];
                        input[j + 1] = tmp;
                    }
                }
            }
            return input;

    }


    public String toString(){
        return "Bubble Sort";
    }
}


