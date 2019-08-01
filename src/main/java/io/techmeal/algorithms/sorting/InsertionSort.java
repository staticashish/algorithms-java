package io.techmeal.algorithms.sorting;

import java.util.Arrays;

/**
 * @author Ashish Sonawane
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] {3, 4, 5, 1, 2};											//		1		1 

		System.out.println("Before insertion sort : "+ Arrays.toString(arr));			//		1		1		
		
		for (int i = 0 ; i < arr.length ; i++) {										//		3		n
			int curr = arr[i];															//      1       1
			int j = i;
			while (j > 0 && arr[j-1] > curr) {											//      3       n - 1 
				arr[j] = arr[j-1];														//		1		1
				j--;																	//		1		1
			}
			arr[j] = curr;																//		1		1
		}
		
		System.out.println("After insertion sort : "+ Arrays.toString(arr));			//		1		1
	}

																						//		1+1+3n+3n-3+1+1+1+1 = 6n+3 = cn+k ~ O(n)
	
}
