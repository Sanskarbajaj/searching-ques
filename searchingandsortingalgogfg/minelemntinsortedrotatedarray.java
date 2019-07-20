package searchingandsortingalgogfg;

public class minelemntinsortedrotatedarray {

	public static void main(String[] args) {

int arr[]= {5,6,7,8,9,1,2,3,4};
int ans=getmin(arr,0,arr.length-1);
System.out.println(ans);


	}
	public static int getmin(int [] arr,int beg,int end)
	{
		int mid=(beg+end)/2;
		if((mid<end||arr[mid]>arr[mid+1])&&(mid>beg||arr[mid]>arr[mid-1]))
		{
			return arr[mid];
		}
		else if(arr[mid]<arr[mid+1])
		{
			return getmin(arr, beg,mid);
		}
		else
			return getmin(arr, mid+1,end);
	}

}
