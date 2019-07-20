package searchingandsortingalgogfg;

public class maxfrequencyinsortedarray {

	public static void main(String[] args) {
		
int arr[]= {1,2,2,2,2,2,2,2,2,3,4,5,5,5,5,5,6};
int x=2;
int ans=countocc(arr, x);
System.out.println(ans);
	}
	public static int maxfreq(int[] arr,int beg,int end,int x)
	{
		while(beg<end)
		{
		int mid=(beg+end)/2;
		if(arr[mid]==x)
		{
			return mid;
		}
		else if(arr[mid]<x)
		{
			beg=mid+1;
		}
		else
		{
			end=mid-1;
		}
	}
		return 0;
	}
	public static int countocc(int [] arr,int x)
	{  int count =0;
		int index=maxfreq(arr,0,arr.length-1, x);
		if(index==-1)
		{
			return 0;
		}
		int left=index-1;
		int right=index+1;
		while(index>0&&arr[left]==x)
		{
			count++;
			left--;
		}
		while(right<arr.length&&arr[right]==x)
		{
			count++;
			right++;
		}
		return count+1;
		
	}

}
