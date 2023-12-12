package com.hard.challenge.tenquestion.oneday;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] arr= {5,6,9,14,19,26,50,65,95,110,115};
		
		int tar=115;
		
	int res=	find(arr,tar);
	
	System.out.println(res);
		
	}

	private static int find(int[] arr, int tar) {
		int start=0;
		int end=arr.length;
		
		
		
		while( start<end) {
		int	mid=(start+end)/2;
			
			if(arr[mid]>tar) {
				end=mid-1;
				
			}
			else if(arr[mid]<tar) {
				start=mid+1;
			}
			
			else {
				return arr[mid];
			}
		}
		return -1;
		
	}

}
