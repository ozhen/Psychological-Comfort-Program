package cmpt213_hw3;

public class SortChecker {
	
		
	public boolean check(int[] arr){
		boolean isSorted = true;
		int k= 1;
		
		for(int i = 0; i< arr.length; i++){
			if(k == arr.length)
				break;
			
			else if( arr[i] > arr[k]){
				isSorted = false;
				break;
			}
			k++;
		}
		
		return isSorted;
	}
}
