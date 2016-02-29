

import java.util.Arrays;

public class Sort {

	public void merge(String[] data, int first, int last)	{
		String[] temp = new String[last - first + 1];	// A new array to hold the merged result
		int mid = (first + last) / 2;
		int i = first, j = mid + 1, k = 0;
		
		// Copy smaller item from each subarray into temp until one
		// of the subarrays is exhausted
		while (i <= mid && j <= last)
		{
			//if (data[i] < data[j])
			if(data[i].compareTo(data[j]) < 0)
				temp[k++] = data[i++];
			else
				temp[k++] = data[j++];
		}
		
		// Copy remaining elements from first subarray, if any
		while (i <= mid)
			temp[k++] = data[i++];
		
		// Copy remaining elements from second subarray, if any
		while (j <= last)
			temp[k++] = data[j++];
		
		// Copy merged data back into original array
		for (i = first; i <= last; i++)
			data[i] = temp[i - first];
	}
	
	public void mergeSort(String[] data, int first, int last)
	{
		
		if (first >= last)
			return;

		int mid = (first + last) / 2;
		mergeSort(data, first, mid);
		mergeSort(data, mid + 1, last);
		
		// merge two sorted parts
		merge(data, first, last);
		
		// intermediate result
		//System.out.println(Arrays.toString(data) + ", first: " + first + ", last: " + last );
	}


	public void merge(int[] data, int first, int last){
		int[] temp = new int[last - first + 1];	// A new array to hold the merged result
		int mid = (first + last) / 2;
		int i = first, j = mid + 1, k = 0;
		
		// Copy smaller item from each subarray into temp until one
		// of the subarrays is exhausted
		while (i <= mid && j <= last)
		{
			if (data[i] < data[j])
				temp[k++] = data[i++];
			else
				temp[k++] = data[j++];
		}
		
		// Copy remaining elements from first subarray, if any
		while (i <= mid)
			temp[k++] = data[i++];
		
		// Copy remaining elements from second subarray, if any
		while (j <= last)
			temp[k++] = data[j++];
		
		// Copy merged data back into original array
		for (i = first; i <= last; i++)
			data[i] = temp[i - first];
	}
	
	public void mergeSort(int[] data, int first, int last){
		
		if (first >= last)
			return;

		int mid = (first + last) / 2;
		mergeSort(data, first, mid);
		mergeSort(data, mid + 1, last);
		
		// merge two sorted parts
		merge(data, first, last);
	}
}
