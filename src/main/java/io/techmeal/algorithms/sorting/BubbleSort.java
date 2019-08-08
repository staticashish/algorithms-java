package io.techmeal.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] {5, 4, 9, 2, 1};												//		1		1 
		System.out.println("Before Bubble sort : "+ Arrays.toString(arr));
		
		int startIndex = 0;																	//		1		1
		int endIndex = arr.length-1;														//		1		1
		for(int j = endIndex ; j > startIndex ; j--) {										//		1		n + 1
			for(int i = startIndex; i < endIndex ; i++) {									//		1		n ( n + 1)
				if(arr[i] > arr[i+1]) {														//		4		n ( n + 1)
					int temp = arr[i];														//		1		n ( n + 1)
					arr[i] = arr[i+1];														//		1		n ( n + 1)		
					arr[i+1] = temp;														//		1		n ( n + 1)	
				}
			}
		}
		
		System.out.println("After Bubble sort : "+ Arrays.toString(arr));					//		1		1
		
																							// 1+1+1+n+n^2+n+n^2+4n+n^2+n+n^2+n+n^2+n+n+1  
																							// = 5n^2 + 10n + 4 ~ kn^2+cn+c' ~ O(n^2)
	}
}
