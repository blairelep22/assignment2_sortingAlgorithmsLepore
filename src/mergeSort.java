public class mergeSort implements SortingAlgorithm {

    public int[] sorty(int[] input){


        //from textbook example
        if(input.length < 2){
            return input;
        }

        int mid = input.length / 2;
        int[] left = new int[mid];
        int[] right = new int[input.length - mid];

        for(int i = 0; i < mid; i++){
            left[i] = input [i];
        }

        for ( int j = mid; j < input.length; j++){
            right[j-mid] = input[j];

        }
        sorty(left);
        sorty(right);

        return merge(input, left, right);
    }

    private static int[] merge(int[] input, int[] left, int[] right){
        int lsize = left.length;
        int rsize = right.length;
        int i = 0, j= 0, k = 0;

        while (i < lsize && j < rsize) {
            if (left[i] <= right[j]) {
                input[k] = left[i];
                i++;
            } else {
                input[k] = right[j];
                j++;
            }
            k++;
        }
        while (j < rsize) {
            input[k] = right[j];
            j++;
            k++;
        }
        while (i < lsize){
            input[k] = left[i];
            i++;
            k++;}

        return input;
    }

    @Override
    public String toString() {
        return "merge Sort";
    }
}
