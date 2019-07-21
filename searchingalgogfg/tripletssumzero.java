package searchingandsortingalgogfg;

public class tripletssumzero {

	public static void main(String[] args) {
		int[] arr= {0, -1, 2, -3, 1};
		//worst approach O(n^3)
		for(int i=0;i<arr.length-2;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println(arr[i]);
						System.out.println(arr[j]);
						System.out.println(arr[k]);
						System.out.println("****************");
					}
				}

			}

		}
		//we can improve the complexity by two pointer approach
		//gives output in O(n^2) complex
		for(int i=0;i<arr.length-1;i++)
		{
			
			int l=i+1;
			int r=arr.length-1;
			while(l<r)
			{
			    if(arr[i]+arr[l]+arr[r]==0)
			    {
			    	System.out.println(arr[i]);
			    	System.out.println(arr[l]);
			    	System.out.println(arr[r]);
			    	System.out.println("*************");
			    	l++;
			    	r--;
			    }
			    else if(arr[i]+arr[l]+arr[r]<0)
			    {
			    	l++;
			    }
			    else if(arr[i]+arr[l]+arr[r]>0)
			    {
			    	r--;
			    }
		}
		}

	}

}
