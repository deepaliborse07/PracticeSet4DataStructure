package com.demo.practice;

public class SpiralArray {
	
	private static void spiralPrint(int m, int n, int[][] a) {
		// TODO Auto-generated method stub
		int i,k=0,l=0;
		
		while(k<m && l<n) {
			for(i=l;i<n;++i) {
				System.out.println(a[k][i]+"");
			}
			k++;
			for(i=k;i<m;i++) {
				System.out.println(a[i][n-1]+"");
			}
			n--;
			if(k<m) {
				for(i=n-1;i>=l;i--) {
					System.out.println(a[m-1][i]+"");
				}
				m--;
			}
			if(l<n) {
				for(i=m-1;i>=k;i--) {
					System.out.println(a[i][l]+"");
				}
				l++;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R=4;
		int C=4;
		
		int a[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				};
		
		spiralPrint(R,C,a);
		}
}


