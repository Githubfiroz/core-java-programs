package com.jci.kotiyana;

public class QuickSortExample {

	public static void main(String[] args) {
		int arr[]= {12, 11, 13, 5, 6, 7};
		
		System.out.println("Before");
		printArr(arr);
		
		quickSort(arr);
		
		//System.out.println("\n After");
		//printArr(arr);
		
		

	}

	private static void quickSort(int[] arr) {
		
		
	}

	private static void printArr(int[] arr) {
		int len=arr.length;
		int count=0;
		for(int i:arr) {
			if(count==0)
				System.out.print("{"+i);
			else if(count==len-1)
				System.out.print(","+i+"}");
			else
				System.out.print(","+i);
			count++;
		}
		
	}
}
