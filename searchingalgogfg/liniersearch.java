package searchingandsortingalgogfg;

public class liniersearch {

	public static void main(String[] args) {
		int arr[]= {9,8,7,6,5,7,5,31};
		int x=7;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==x)
				{
					System.out.println(i);
					break;
				}
			}
		}

	}

}
