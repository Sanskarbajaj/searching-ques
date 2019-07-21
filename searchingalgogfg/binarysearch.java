package searchingandsortingalgogfg;

public class binarysearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int x=7;
		int ans=binarysrch(arr, x);
		System.out.println(ans);
	}
	public static int binarysrch(int[] arr,int x)
	{
		int beg=0,end=arr.length-1;
		while(beg<=end)
		{
		int mid=(beg+end)/2;
		if(arr[mid]==x)
		{
			return mid;
		}
		else if(arr[mid]>x)
		{
			end=mid-1;
		}
		else
		{
		  beg=mid+1;
		}
	}
		
	return -1;
	}
}
	