public class CountingSort {

    // Passing max and min allow us to sort elements between any range.
    public static void countingSort(int[] inputArray, int min, int max){
        // Build the frequency array to calculate how many occurrences of
        // each element are present in the input array.
        int [] frequency = new int[(max-min)+1];
        for (int i=0;i<inputArray.length;i++){
            int item = inputArray[i];
            frequency[item-min] = frequency[item-min]+1;
        }
        // This appends the values as per the frequency array in the input array
        // e.g. if x appears n number of times, then adds x n times in the input array.
        // Since we added the elements in the frequency in the ascending order, we will
        // add elements back in the input array in ascending order.
        int start =0;
        for (int i=0; i<frequency.length;i++){
            if (frequency[i]>0){
                for (int j=0;j<frequency[i];j++){
                    inputArray[start++] = (min+i);
                }
            }
        }
        System.out.println("Size of the input array "+inputArray.length);
        displayArray(inputArray);
    }

    public static void displayArray(int[] inputArray){

        for (int i=0; i<inputArray.length;i++){
            System.out.println(inputArray[i]);
        }
    }

    public static void main(String [] args){
//        int [] inputArray = new int[]{2,5,9,8,2,8,7,10,4,2,4,6,9,3};
        int [] inputArray = new int[]{112,115,119,118,120,118,117,120,114,112,114,116,119,123};
        countingSort(inputArray,110,125);
    }
}
