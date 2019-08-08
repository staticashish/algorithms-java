package io.techmeal.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] {20,35,-15,7,55,1,-22};												//		1		1 
		System.out.println("Before selection sort : "+ Arrays.toString(arr));
		
		int endIndex = arr.length -1 ;
		int largest = 0;
		for(int i = endIndex ; i > 0 ; i--) {
			for(int j = 0 ; j < i ; j++) {
				if(arr[j] > arr[largest]) {
					largest = j; 
				}
			}
			swap(arr, largest, i); 
		}
		
		System.out.println("After selection sort : "+ Arrays.toString(arr));
	}

	private static void swap(int[] arr, int largest, int i) {
		int temp = arr[i];
		arr[i] = arr[largest];
		arr[largest] = temp;
	}

}
