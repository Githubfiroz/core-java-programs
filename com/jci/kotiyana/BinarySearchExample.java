package com.jci.kotiyana;

public class BinarySearchExample {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 12, 213,16, 23, 38, 56, 72, 91 };
        int target = 72;
        
        int result=binarySearch(arr,target);
        
        if(result != -1)System.out.println("Element found at "+result+"th index." );
        else System.out.println("Element did not found in the provided Array.");

	}

	private static int binarySearch(int[] arr, int target) {
		int left=0;
		int right=arr.length-1;

		while( left<=right) {
			int mid = left + (right-left)/2;
			
			
			if(arr[mid]==target)return mid;
			
			if(target< arr[mid]) right=mid-1;
			else
				left=mid+1;
			
		}
		
		return -1;
	}

}
