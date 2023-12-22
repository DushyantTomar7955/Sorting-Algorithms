package Algorithms;

import java.util.Scanner;

public class RecursiveBinarySearch {
	public static int recursiveBinarySearch(int a[],int key,int l,int h) {
		if(l<=h) {
			int mid=l+(h-l)/2;
			if(a[mid]==key)
				return mid;
			else if(key<mid)
				return recursiveBinarySearch(a,key,l,mid-1);
			else
				return recursiveBinarySearch(a,key,mid+1,h);

		}
		return -1;
		
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
		System.out.print("Enter the Key to be Searched: ");
		int key=sc.nextInt();
		int index=recursiveBinarySearch(a,key,0,n-1);
		if(index==-1)
			System.err.println("Key is not Found...");
		else
			System.out.println("Key is Found At index: "+index);

	}

}
