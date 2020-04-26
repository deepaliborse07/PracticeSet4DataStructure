package com.demo.practice;

public class PushZero {
	
	private static void PushZerosToEnd(int[] arr, int n) {
		// TODO Auto-generated method stub
	
		int count=0;
		for(int i=0;i<n;i++) 
			if(arr[i]!=0)
				arr[count++]=arr[i];
		
		while(count<n)
		{
			arr[count++]=0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,0,-3,0,0,4};
		int n=arr.length;
		PushZerosToEnd(arr,n);
		System.out.println("Arrays after pushing zeros at back");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+"");
		}

	}

	

}
