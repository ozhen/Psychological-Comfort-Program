package cmpt213_hw3;

import java.util.Arrays;

public class A3 {
	public static void main(String[] args)
	{
		BinarySearch bin = new BinarySearch();
		Sort st = new Sort();
		SortChecker sc = new SortChecker();
		
		int target,index;
	
		int[] arr = {38, 27, 43, 3, 9, 82, 10};	
		
		boolean isSorted;
		
		/*//check binary search
		target = 9;
		index = bin.Search(arr, target);
		System.out.println("Find " + target + " at index " + index);
		*/
		
		isSorted = sc.check(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(isSorted);
		
		st.mergeSort(arr,0,arr.length - 1);
		isSorted = sc.check(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(isSorted);
		
	}
}
