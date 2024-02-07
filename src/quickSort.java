import java.util.Random;


public class quickSort implements SortingAlgorithm{

    //from textbook example
    public int[] sorty(int[] input){
        return quickSort(input, 0, input.length-1);
    }

        private static int[] quickSort ( int[] input, int lowindex, int highindex){

            if (lowindex >= highindex) {
                return input;
            }
            int indexOfPivot = new Random().nextInt(highindex - lowindex) + lowindex;
            int pivot = input[indexOfPivot];
            swap(input, indexOfPivot, highindex);

            int lposition = lowindex;
            int rposition = highindex - 1;


            //partitioning
            while (lposition < rposition) {
                while (input[lposition] <= pivot && lposition < rposition) {
                    ++lposition;
                }
                while (input[rposition] >= pivot && lposition < rposition) {
                    --rposition;
                }
                swap(input, lposition, rposition);
            }
            //reminder on swap method from google and textbook
            //recursively calls

            if (input[lposition] > input[highindex]) {
                swap(input, lposition, highindex);
            } else {
                lposition = highindex;
            }

            quickSort(input, lowindex, lposition - 1);
            quickSort(input, lposition + 1, highindex);

            return input;
        }
        //again swap refresher from book and google
        private static void swap ( int[] arr, int index1, int index2){
            int tmp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = tmp;
        }

    @Override
    public String toString() {
        return "quick sort";
    }

    }
