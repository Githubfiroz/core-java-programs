package com.jci.kotiyana;

public class InsertionSortExample {

	public static void main(String[] args) {
		int arr[]= {1,3,7,9,16,5};
		System.out.println("Before");
		printArr(arr);
		insertionSort(arr);
		System.out.println("\n After");
		printArr(arr);

	}

	private static void insertionSort(int[] arr) {
		
		int len=arr.length;
		for (int j = 0; j < len; j++){
			//System.out.println(j+" >> "+arr[j]);
			int key = arr[j];
			int i=j-1;
			while(i>-1 && arr[i]>key) {
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
		}
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
