package com.jci.kotiyana;

public class BubbleSortExample {

	public static void main(String[] args) {
		int arr[] = {12,16,19,23,4,32,6,58};
		
		System.out.println("Before");
		printArr(arr);
		
		bubbleSort(arr);
		
		System.out.println("\n After");
		printArr(arr);
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

	private static void bubbleSort(int[] arr) {
		int arrLen=arr.length;
		int temp=0;
		for (int i = 0; i < arrLen; i++) {
			for(int j=1;j<arrLen;j++) {
				
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

}
