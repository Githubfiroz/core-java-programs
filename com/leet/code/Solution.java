package com.leet.code;

class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		//case1: output - [1,2,2,3,5,6]
		int nums1[] = {1,2,3,0,0,0 };
		int nums2[] = { 2,5,6};
		int m = 3;//nums1.length;
		int n = nums2.length;
		  
		 
		/*
		//case2:output - [1] 
		int nums1[] = {1};
		int nums2[] = {};
		int m = nums1.length;
		int n = nums2.length;
		*/
		
		/*
		//case3:output - [1]  
		int nums1[] = {0};
		int nums2[] = {1};
	
		int m = 0;//nums1.length;
		int n = 1;//nums2.length;
		*/
		sol.merge(nums1, m, nums2, n);

	}

    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int i;
    	
    	if(m==0)i = 0;
    	else i = m-1;
    		
        
    	int j = n-1;
        int k = m+n-1;
        
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else {
                nums1[k--] = nums2[j--];
            }
        }

        /*
        while(j >=0){
            nums1[k--] = nums2[j--];
            System.out.println("while <nums1>"+ nums1 );
        }
        */
        int count=0;
        for(int num : nums1) {
        	if(nums1.length==1) {
        		System.out.print("["+ num +"]");
        	}
        	else if(count==0) {
        		System.out.print("["+num +",");
        	}
        	else if(count==nums1.length-1) {
        		System.out.print(num+"] ");
        	}
        	else System.out.print(num + "," );
        	
        	count++;
        }
        System.out.println();
        
    }
}