

public class BinarySearch {

	public int Search(String[] arr, String target)
	{
		int	first = 0, last = arr.length - 1;
		
		while (first <= last)
		{
			int mid = (first + last) / 2;
			if (target.compareTo(arr[mid]) == 0) 
				return mid;
			else if (target.compareTo(arr[mid]) > 0)
				first = mid + 1;
			else
				last = mid - 1;
		}
		return -1;
	}
}
