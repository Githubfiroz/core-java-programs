package com.jci.kotiyana;

public class MaxMinNumberInArray {

	static void minArr(int arr[]) {
		
		int minNum = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(minNum>=arr[i])
				minNum=arr[i];
			
			//System.out.println("arrNumbers>>"+arr[i]);
			
		}
		//System.out.println("################## >> ############### ");
		System.out.println("minNum>>"+minNum);
	}
	static void maxArr(int arr[]) {
		int maxNum = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(maxNum<=arr[i])
				maxNum=arr[i];
			//System.out.println("arrNumbers>>"+arr[i]);
				
		}
		//System.out.println("################## >> ############### ");
		System.out.println("maxNum>>"+maxNum);
	}
	
	public static void main(String[] args) {
		int arrNumbers[] = {33,362,14,24,5,34,155};
		
		minArr(arrNumbers);
		maxArr(arrNumbers);
		
	}

}
