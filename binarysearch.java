package binarysearch;

import java.util.Scanner;

//precondition is that array has to be sorted 

public class binarysearch {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		// n is user input integer 
		
		int n = in.nextInt();
		// Declare an array
		// Based on integer entered by user 
			int[] arr = new int[n];
		
		System.out.println("Enter the values in an array");
		// Uses for loop to add values in array entered by user
			for(int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
		
		System.out.println("Enter value to be searched");
		
		// Initializes user input to integer variable below
			int num = in.nextInt();
		// Set initial values of low, high, mid
		// Remember n is the total number of items in array
		// Based on logic high is - 1
			int low = 0;
			int high = n - 1;
			int mid = 0;
		
			
			while (low <= high) {
				// Find middle, and is re-ran when a new range of items
				// is generated in search of n 
				
				mid = (low + high)/2;
				// Return mid if this is the value we are searching 
				if (arr[mid] == num) {
					System.out.println("Value is found at index" + " " + mid);
					break;
				// look at the values less than mid
				} else if (arr[mid] > num) {
					high = mid - 1;
				// look at values greater than mid
				} else if (arr[mid] < num) {
					low = mid + 1;
				}
			}
			// one low is greater than high, the number is not in the array
			if (low > high) {
				System.out.println("Value is not in array");
			}
	}
}
