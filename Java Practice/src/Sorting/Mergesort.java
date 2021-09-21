public class Mergesort {

    public static void mergeSort(int[] input, int start, int end){

        if (end - start < 2) {
            return;
        }

        int mid = (start+end)/2;
        mergeSort(input,start,mid);
        mergeSort(input,mid,end);
        merge(input,start,mid,end);
    }

    public static void merge (int [] input,int start, int mid,int end){

        if (input[mid-1] < input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int [] temp = new int[end-start];

        //merge 2 subarrays into one sorted Sorting.Array
        while (i<mid && j<end){
            if (input[i]<= input[j]){
                temp[tempIndex++] = input[i++];
            }
            else{
                temp[tempIndex++] = input[j++];
            }
        }

        //Handle remaining elements after copying elements from either of the subarray
        // If elements are left over in the left array
        System.arraycopy(input,i,input,start+tempIndex,mid-i);
        // Following will only copy the elements that need to change their position
        System.arraycopy(temp,0,input,start,tempIndex);
    }

    public static void displayArray(int[] inputArray){

        for (int i=0; i<inputArray.length;i++){
            System.out.println(inputArray[i]);
        }
    }

    public static void main(String args[]){
        int [] input = {20,-15,7,1,35,-55,22};
        displayArray(input);
        System.out.println("After Mergesort");
        mergeSort(input, 0 , input.length);
        displayArray(input);
    }
}
