package Algorithms;
import java.util.*;


public class RecursiveLinearSearch {
	    public static int recursiveLinearSearch(int a[],int n,int key){
	        if(n==0)
	        return -1;
	        else if(a[n-1]==key)
	        return n-1;
	        else
	        return recursiveLinearSearch(a,n-1,key);
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
			int index=recursiveLinearSearch(a,n,key);
			if(index==-1){
			    System.out.println("Element is not Found: ");
			}
			else
			System.out.println("Element is found at index: "+index);
		}
}
