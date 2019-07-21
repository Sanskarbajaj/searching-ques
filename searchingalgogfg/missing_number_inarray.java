package searchingandsortingalgogfg;

import java.util.Scanner;

public class missing_number_inarray {

	public static void main(String[] args) {
		//************** 1. ******************
		//no duplicates in this 
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int[] arr=new int[n];
	  //total sum of entire array
	  int total=(((n+1)*(n+2))/2);  //cause 1 number is missing thats y we are using this
	  for(int i=0;i<arr.length;i++)
	  {
		  arr[i]=s.nextInt();
	  }
	  //subtracting all elements from total
	  for(int i=0;i<arr.length;i++)
	  {
		  total=Math.abs(total-arr[i]);
	  }
	  
	  System.out.println(total);
		
		//************* 2. ****************
		int arr1[]= {1,2,4,5,6};
		int x1=arr[0];
		int x2=1;
		int n1=arr1.length;
		//Xor operation from 1 to less than n
		for(int i=1;i<n1;i++)
		{
			x1=x1^arr[i];
		}
		//Xor on 2 to n+1 with iteration
		for(int i=2;i<=n1+1;i++)
		{
			x2=x2^i;
		}
// final will be xoring x1 and x2 //a1^a1=0&&0^a1=a1;
		int ans=	x1^x2;
	System.out.println(ans);
		

	}
	

}
