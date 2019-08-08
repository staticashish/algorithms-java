package io.techmeal.algorithms.sorting;

import java.util.Arrays;

/**
 * @author Ashish Sonawane
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = new int[] {5, 4, 3, 2};												//		1		1 
		System.out.println("Before insertion sort : "+ Arrays.toString(arr));			//		1		1		
		
		for (int i = 0 ; i < arr.length ; i++) {										//		3		n + 1
			int curr = arr[i];															//      1       n
			int j = i;																	//      1       n
			while (j > 0 && arr[j-1] > curr) {											//      3       pn 
				arr[j] = arr[j-1];														//		1		pn
				j--;																	//		1		pn
			}
			arr[j] = curr;																//		1		n
		}
		
		System.out.println("After insertion sort : "+ Arrays.toString(arr));			//		1		1
	}
																						//	1+1+3n+3+n+n+3pn+pn+kn+n=	 cn+k ~ O(n)
}
