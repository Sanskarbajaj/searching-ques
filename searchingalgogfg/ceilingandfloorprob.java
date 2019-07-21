package searchingandsortingalgogfg;

public class ceilingandfloorprob {

	public static void main(String[] args) {
		//sorted array given in prob
		int arr[] = {1,2,3,5,6,8,9};
		int i;
		//one way can be linear search
		// x is nmbr for whom u want floor and cieling
		int x=7;
		//search linearly
		for(i=0;i<arr.length;i++)
		{ 
			if(arr[i]<=x&&arr[i+1]>=x)
			{
				break;
			}		
		}
		
		System.out.println(arr[i]);
		System.out.println(arr[i+1]);
		// having complexity O(n)
		//**********************************
		// Tadaaa!! Time for binary search
		//beg=0 is indexes and end=6 is arr.length-1
		int beg=0,end=6;//indexes
		while(beg<end)
		{
			int mid=(beg+end)/2;
			if(x<arr[beg]||x>arr[end])
			{
				System.out.println(-1);
			}
			else if(arr[mid]==x)
			{
				System.out.println(arr[mid-1]);
				System.out.println(arr[mid]);
				return;
			}
			else if(arr[mid]<=x&&arr[mid+1]>=x)
			{
				System.out.println(arr[mid]);
				System.out.println(arr[mid+1]);
				return;
			}
			else if(arr[mid]>x)
			{
				end=mid-1;
			}
			else if(arr[mid]<x)
			{
				beg=mid+1;
			}
			
		}
		
	}
}
