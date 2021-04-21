package day2.task3;

import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
		Exercise3 obj = new Exercise3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements:");
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int result[] = obj.getSorted(arr);
		System.out.println("The sorted array :");
		for(int i = 0;i < n;i++) {
			System.out.print(result[i] + " ");
		}
	}
    
    public int[] getSorted(int[] arr) {
    	int len = arr.length;
    	int templen = len;
    	for(int i = 0;i < len/2;i++) {
    		int temp = arr[templen - 1];
    		arr[templen-1] = arr[i];
    		arr[i] = temp;
    		templen--;
    	}
    	System.out.println("Reversed array :");
    	for(int i = 0;i < len;i++) {
    		System.out.print(arr[i] + " ");
       	}
    	System.out.println("\n");
    	Arrays.sort(arr);
    	return arr;
    	
    }
}
