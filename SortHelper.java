import java.util.Arrays;
import java.util.Random;

public class SortHelper {

	// This creates an array with n randomly generated elements between (0, n*10]
	public static long[] randArray(int n) {
		long[] rand = new long[n];
		for(int i=0; i<n; i++)
			rand[i] = (int) (Math.random() * n * 10);
		return rand;
	}

	// This tests whether your sorted result is correct by comparing it to reference result
	public static boolean testSort(long[] a) {
		long[] a2 = new long[a.length];
		System.arraycopy(a, 0, a2, 0, a.length);
		Arrays.sort(a);
		for(int i = 0; i < a.length; i++)
			if(a2[i] != a[i])
				return false;
		return true;
	}

	// This creates an ordered array with n elements in ascending order
	public static long[] orderedArray(int n) {
		long[] arr = new long[n];
		for(int i=0; i<n; i++)
			arr[i] = i+1;
		return arr;
	}


}