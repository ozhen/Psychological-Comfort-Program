

public class SortChecker {
	
		
	public boolean check(String[] arr){
		boolean isSorted = true;
		int k= 1;
		
		for(int i = 0; i< arr.length; i++){
			if(k == arr.length)
				break;
			
			else if( arr[i].compareTo(arr[k]) > 0){
				isSorted = false;
				break;
			}
			k++;
		}
		
		return isSorted;
	}
}
