package day2.task3;

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
		Exercise2 obj = new Exercise2();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int len = sc.nextInt();
		String[] str = new String[len];
		System.out.println("Enter the strings :");
		for(int i = 0;i < len;i++) {
			str[i] = sc.next();
		}
		
		String[] result = obj.sortString(str);
		for(int i = 0; i < len ; i++) {
			System.out.print(result[i] + " ");
		}
	}
    
    public String[] sortString(String[] arr) {
    	Arrays.sort(arr);
        int len = arr.length;
        for(int i = 0;i < len;i++) {
        	int strlen = arr[i].length();
    		if(strlen%2 == 0) {
    			arr[i] = arr[i].substring(0 , strlen/2).toUpperCase() + arr[i].substring(strlen/2).toLowerCase();
    		}else {
    			arr[i] = arr[i].substring(0 , strlen/2+1).toUpperCase() + arr[i].substring(strlen/2+1).toLowerCase();
    		}
    	}
    	
    	return arr;
    }
}
