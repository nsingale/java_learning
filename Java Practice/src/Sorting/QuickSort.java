public class QuickSort {

    public static void quickSort(int [] input, int start, int end){
        // Base condition for recursion.
        if (end - start < 2){
            return;
        }
        // Find the correct position of the pivot element and then recursively
        // sort left and the right sub arrays
        int pivotIndex = partition(input,start,end);
        quickSort(input,start,pivotIndex);
        quickSort(input,pivotIndex+1,end);
    }

    public static int partition(int [] input, int start, int end){
        // Using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end ;
        // Check if i and j have crossed
        while (i < j){
            // Traverse the array alternatively from right to left and then left to right

            // Traverse right to left finding the first element less than the pivot
            // if found move that to the left side of the array.
            // empty loop to find the first element lesser than pivot which is present to the right of actual
            // position of pivot
            while (i < j && input[--j] >= pivot);
            if (i < j){
                input[i] = input[j];
            }

            // Traverse left to right finding the first element greater than the pivot
            // if found move that to the right side of the array.
            // empty loop to find the first element greater than pivot which is present to the left of actual
            // position of pivot
            while (i < j && input[++i] <= pivot);
            if (i<j){
                input[j] = input [i];
            }
        }

        input[j] = pivot;

        return j;
    }

    // Display array
    public static void displayArray(int[] inputArray){

        for (int i=0; i<inputArray.length;i++){
            System.out.println(inputArray[i]);
        }
    }

    public static void main (String args[]){
        int [] input = {20,-15,7,1,35,-55,22};
        displayArray(input);
        System.out.println("After Quick sort");
        quickSort(input,0,input.length);
        displayArray(input);
    }
}
