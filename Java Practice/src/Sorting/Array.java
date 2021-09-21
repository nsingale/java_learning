package Sorting;

import java.util.Scanner;

public class Array{

	public int[] createInputArray(){
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter number of elemenents followed by the actual elements");
		int size = myObj.nextInt();
		int [] intArray = new int[size];
		for (int i=0; i<size;i++){
			intArray[i] = myObj.nextInt();
		}
		return intArray;
	}

	public void displayArray(int[] inputArray){

		for (int i=0; i<inputArray.length;i++){
			System.out.println(inputArray[i]);
		}
	}

	/*
		Bubble Sort
		@param inputArray which might be containing numbers.
		@return sorted array after the in-place swapping takes place.
	 */
	public void bubbleSort(int[] inputArray){
		// This is the beginning of the sorted array partition (logical)
		int stopIndex = inputArray.length-1;

		// Outer loop which defines how many times the unsorted array partition (logical) is sorted.
		for (int j= stopIndex; j>0;j--) {
			// Inner loop which sorts the unsorted partition by comparing adjacent elements
			// and swapping if needed.
			for (int i=0; i<j;i++){
				if (inputArray[i] == inputArray[i+1]){
					continue;
				}
				if (inputArray[i]>inputArray[i+1]){
					int temp = inputArray[i];
					inputArray[i] = inputArray[i+1];
					inputArray[i+1] = temp;
				}
			}
		}
	}

	/*
    	Selection Sort
    	@param inputArray which might be containing numbers.
    	@return sorted array after the in-place swapping takes place.
 	*/
	public void selectionSort(int[] inputArray){

		//Outer for loop which runs till the entire array is sorted.
		for (int sorted_array_index = inputArray.length-1; sorted_array_index>0; sorted_array_index--){
			int max_element_index = 0;

			//Inner for loop to find out which is the index for the maximum element
			for (int i = 1;i<= sorted_array_index ; i++){
				if (inputArray[i] > inputArray[max_element_index]){
					max_element_index = i;
				}
			}
			//Swapping is to be done only after finding the maximum element hence we do it in the
			// outer for loop when we actually know which index the largest element is present.
			int temp = inputArray[sorted_array_index];
			inputArray[sorted_array_index] = inputArray[max_element_index];
			inputArray[max_element_index] = temp;
		}
	}


	/*
    Insertion Sort
    @param inputArray which might be containing numbers.
    @return sorted array after the in-place swapping takes place.
 	*/
	public void insertionSort(int[] inputArray){

		//Loop over the unsorted partition starting at position 1
		for (int unsorted_index =1; unsorted_index <inputArray.length;unsorted_index++){
			// Store the element to be sorted. We need this because while shifting the position will
			// be changed.
			int unsorted_element = inputArray[unsorted_index];

			// Execute the for loop till the time sorted element index >0 and the element prior to the
			// sorted index is greater than the element to be sorted. Once we find the correct position
			// start shifting the elements within the sorted partition.

			int sorted_element_index;
			for (sorted_element_index = unsorted_index;
				 sorted_element_index >0 && inputArray[sorted_element_index-1] >unsorted_element; sorted_element_index--){
					inputArray[sorted_element_index] = inputArray[sorted_element_index-1];
			}
			inputArray[sorted_element_index] = unsorted_element;
		}
	}


	/*
	Shell Sort
	@param inputArray which might be containing numbers.
	@return sorted array after the in-place swapping takes place.
	*/
	public void shellSort(int[] inputArray){
		//Iterate for the gap values starting from the (middle of the array+1)
		for (int gap = (inputArray.length/2)+1; gap >=1;gap = gap/2){
			//Compare elements present at the index and index-gap
			for (int i = gap; i<inputArray.length;i++){
				//Element to be sorted
				int new_element = inputArray[i];
				// Compare and shift if needed
				if (inputArray[i] < inputArray[i-gap]){
					inputArray [i] = inputArray[i-gap];
					inputArray[i-gap] = new_element;
				}
			}
		}
	}

	public static void main (String [] args){
		Array obj = new Array();
		int [] inputArray = obj.createInputArray();
//		int [] inputArray = new int[]{20,-15,7,1,35,55,-22};

		//Bubble Sort
		obj.bubbleSort(inputArray);
		System.out.println("Sorted Sorting.Array is ");
		obj.displayArray(inputArray);

		//Selection Sort
		obj.selectionSort(inputArray);
		System.out.println("Sorted Sorting.Array is ");
		obj.displayArray(inputArray);

		//Insertion Sort
		obj.insertionSort(inputArray);
		System.out.println("Sorted Sorting.Array is ");
		obj.displayArray(inputArray);

		//Shell Sort
		obj.shellSort(inputArray);
		System.out.println("Sorted Sorting.Array is ");
		obj.displayArray(inputArray);
	}
}