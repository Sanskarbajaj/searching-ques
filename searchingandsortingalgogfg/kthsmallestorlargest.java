package searchingandsortingalgogfg;

import java.util.Arrays;

public class kthsmallestorlargest {

	public static void main(String[] args) {
		//random array
		int arr[]= {3,45,1,30,98,333,12};
		//k=3 means we want the 3rd largest value in an array
		int k=3;
		// ist method is sorting 
		Arrays.sort(arr);
		System.out.println(arr[arr.length-k]);
		//this method has compexity O(nlogn)
		//*************************************
		//using max heap can also solve this question in O(n) complexity 
		//***********we will learn in another program**************

	}

}
