package day2.task3;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
		Exercise4 obj = new Exercise4();
		System.out.println("Enter the length of the array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements :");
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Modified array :");
		int result[] = obj.modifyArray(arr);
		for(int i = 0;i< result.length;i++) {
			System.out.print(result[i] + " ");
		}
	}
    
    public int[] modifyArray(int arr[]) {
    	Arrays.sort(arr);
    	int len = arr.length;
    	int count = 1;
    	for(int i = 0;i < len;i++) {
    		if(i+1 < len) {
    			if(arr[i] != arr[i+1]) count++;
    			}
    	}
    	
    	int result[] = new int[count];
    	int j = 0;
    	for(int i = 0;i < len;i++) {
    		if(i != len-1) {
    			if(arr[i] != arr[i+1]) {
    				result[j] = arr[i];
    				j++;
    			}
    		}
    		
    	}
    	result[result.length - 1] = arr[len-1];
    	return result;
    }
}
