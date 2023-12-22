package Algorithms;

import java.util.Scanner;

public class QuickSortAlgorithm {
	public static void swap(int a[],int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static int partition(int a[],int low,int high) {
		int pivot=a[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(a[j]<pivot) {
				i++;
				swap(a,i,j);
			}
		}
		swap(a,i+1,high);
		return (i+1);
	}
	
	public static void quickSort(int a[],int low,int high) {
		if(low<high) {
			int pi=partition(a,low,high);
			quickSort(a,low,pi-1);
			quickSort(a,pi+1,high);
		}
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Size of Array: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.print("Enter the Elements of Array: ");
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	}
	System.out.print("Before Sorting the Array: ");
	for(int i=0;i<n;i++){
	   System.out.print(a[i]+" ");
	}
	quickSort(a,0,n-1);
	System.out.println();
	System.out.print("After Sorting the Array: ");
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
	
}
}