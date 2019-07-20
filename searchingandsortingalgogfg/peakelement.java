package searchingandsortingalgogfg;

public class peakelement {

	public static void main(String[] args) {
		//random array  this code will help to find the peak element in array that is greater than previous and next elemnt
		int arr[]= {10,20,15, 2, 23, 90, 67};
		//handling corner cases ie starting and ending elemnt has only 1 neighbour
		if(arr[0]>arr[1])
		{
			System.out.println(arr[0]);
			System.out.println("peak");
		}
		else if(arr[arr.length-1]>arr[arr.length-2])
		{
			System.out.println(arr[arr.length-1]);
			System.out.println("peak");
		}
		//main work from here 
				//O(n) time complexity
				//***************** can have one more corner case if all elemnts are same
			
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])
			{
				System.out.println(arr[i]);
				System.out.println("peak");
			}
		}
		int ans=getpeak(arr,0,arr.length-1,arr.length);
		System.out.println(ans);
	}
		
	//better option is binary search 
	public static int getpeak(int[] arr,int beg,int end,int n)
	{
		int mid=(beg+end)/2;
		 if ((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid+1] <= arr[mid]))
		 { System.out.println("peak");
	            return arr[mid];
		 }
		 else if( mid>0&&arr[mid]<arr[mid-1])
			 return getpeak(arr,0,mid-1, n);
		 else 
			 return getpeak(arr,mid+1,end, n);
	}

}
