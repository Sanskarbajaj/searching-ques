package searchingandsortingalgogfg;

import java.util.Arrays;

public class minmaxinlesscompare {

	public static void main(String[] args) {
		int arr[]= {6,7,28,1,87,233,98};
		//arrays.sort uses merge sort having time complexity O(nlogn)+2 printing operation overall O(nlogn) complex
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		//*****************************************
		//this method will take more time to execute cause of O(n) complexity    worst approach
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		//************************************
		//using min and max heap is best approach for this particular problem

	}

}
