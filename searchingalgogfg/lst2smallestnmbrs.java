package searchingandsortingalgogfg;

public class lst2smallestnmbrs {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		smll(arr);
//O(n) complexity
	}
	public static void smll(int[] arr)
	{
		int fst,scnd;
		//first and second value as max if get min then update 
		 fst=scnd=Integer.MAX_VALUE;
		 //array must have atleast 2 elements for this function
		 if(arr.length<2)
		 {
			 System.out.println("invalid");
		 }
		 else
		 {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<fst)
			{
				scnd=fst;
				fst=arr[i];
			}
			else if(arr[i]<scnd&&arr[i]!=fst)
			{
				scnd=arr[i];
			}
		}
		System.out.println(fst);
		System.out.println(scnd);
	}
	}
}
