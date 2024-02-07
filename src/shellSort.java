public class shellSort implements SortingAlgorithm{
    public int[] sorty (int[] input) {

        //from book
        //used for k sort changing gap val
        for (int gap = input.length / 2; gap > 0; gap /=2){
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

    @Override
    public String toString() {
        return "shell sort";
    }
}



