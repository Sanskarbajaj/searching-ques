package searchingandsortingalgogfg;

public class medianof2sortedsamesizearray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 6 };
		int brr[] = { 4, 6, 8, 10 };
		int ans = getmedian(arr, brr);
		System.out.println(ans);
	}

	public static int getmedian(int[] arr, int[] brr) {
		int m1 = 0, m2 = 0;
		if (arr.length % 2 != 0 || brr.length % 2 != 0) {m1 = arr[(arr.length / 2)];
			m2 = brr[(brr.length / 2)];
		} else
		{
		 m1=Math.max(arr[arr.length/2], brr[brr.length/2]);
		m2=Math.min(arr[(arr.length/2)-3], brr[(brr.length/2)-3]);
		}
		return m1+m2/2;
	}
}