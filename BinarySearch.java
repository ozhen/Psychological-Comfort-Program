package cmpt213_hw3;

public class BinarySearch {

	public int Search(int[] arr, int target)
	{
		int	first = 0, last = arr.length - 1;
		
		while (first <= last)
		{
			// System.out.println("index range: " + first + ", " + last);
			int mid = (first + last) / 2;
			if (target == arr[mid]) 
				return mid;
			if (target > arr[mid])
				first = mid + 1;
			else
				last = mid - 1;
		}
		return -1;
	}
}
