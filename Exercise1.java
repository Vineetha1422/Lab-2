package day2.task3;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the elements of an array");
		for(int i = 0;i < length;i++) {
			arr[i] = sc.nextInt();		
		}
		System.out.println("The second minimum value is: " + obj.getSecondSmallest(arr));
	}
    
    public int getSecondSmallest(int[] arr) {
    	int min = arr[0] , min2 = arr[1];
    	if(min > min2) {
    		min = arr[1];
    		min2 = arr[0];
    	}
    	for(int i = 2;i < arr.length;i++) {
    		if(min > arr[i]) {
    			min = arr[i];
    		}
    		if(min2 > arr[i] && arr[i] != min) {
    			min2 = arr[i];
    		}
    	}
    	
    	return min2;
    }
}
