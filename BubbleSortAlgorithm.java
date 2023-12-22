package Algorithms;

import java.util.Scanner;

public class BubbleSortAlgorithm {
	
	public static void bubbleSort(int a[],int n) {
		int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
					
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int n=sc.nextInt();
		System.out.print("Enter the Array Elements: ");
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
       bubbleSort(a,n);
       System.out.print("After Sorting the Array: ");
       for(int i=0;i<n;i++) {
    	   System.out.print(a[i]+" ");
       }

    }
}
