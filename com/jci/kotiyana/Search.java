package com.jci.kotiyana;

public class Search {

	public static void main(String[] args) {
		//System.out.println(" Search");
		Search binarySearch = new Search();
		int numArr[] = {2,7,110,23,20,35,10};
		int numToBeSearched=10;
		binarySearch.BinarySearch(numArr, numToBeSearched);
		

	}

	private void BinarySearch(int arr[], int num) {
		//System.out.println("Binary Search");
		int arrlength = arr.length;
		int midNum = 0;
		int numToBeSearched=num;
		boolean available=false;
		int latestArr[]= new int[arrlength];
		int latestLength=0;
		
		if(arrlength==0) {
			System.out.println("Array is empty. "+numToBeSearched+" is not available in the array.");
		}
		else if(arrlength==1 ) {latestLength++;
			if(latestArr[0] == numToBeSearched) {
				System.out.println("Array has only one element "+numToBeSearched+" and is available in the array.");
			}else
				System.out.println("Array has only one element "+numToBeSearched+" and is not available in the array.");
		}
		else if(arrlength>1){
			
			midNum = 1+arrlength/2;
			
			System.out.println("\n arrlength>>"+arrlength+" <Line 37> midNum>> "+midNum);
			
			for(int i=0;i<midNum;i++) { latestLength++;
				latestArr[i]=arr[i];
				if(i==0)System.out.print("["+latestArr[i]);
				else if(i>0 & i<midNum) System.out.print(","+latestArr[i]);
				else if(i==midNum) System.out.print(","+latestArr[i]+"]");
				
				if(numToBeSearched==arr[i]) {
					available=true;
					System.out.println("] element "+numToBeSearched+" is available. ");
					break;
				}
			}
			if(!available) {
				System.out.println("] "+numToBeSearched+" Not avail."+latestLength +" arrlength "+arrlength);
				int newArr[]= new int[latestLength];
				
				for(int i=0, j=latestLength-1;j<arrlength;i++,j++) {
					
					//System.out.println("<< i >>"+i+"<< j >>"+j+" >> "+arr[j]);
					newArr[i]=arr[j];
					
					if(i==0)System.out.print("new array ["+newArr[i]);
					else if(i>0 && i<latestLength-1) System.out.print(","+newArr[i]);
					else if(i==latestLength-1) System.out.print(","+newArr[i]+"]");
				}
				BinarySearch(newArr, numToBeSearched);
			}
			
		}	
		//System.out.println(arrlength+"<Binary Search>"+midNum);
	}
}
