import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Doctor {
	int cnt =0;
	
	public void Greeting(){
		//response to the patient
		if(cnt == 1){
			System.out.println("Is there anything else?");
		}
		else{
		System.out.println("Hello there, what can I help you with today?");
		cnt = 1;
		}
	}
	
	//passing words spilted from Patient's response
	/*
	 * call class Patterns
	 * check if the response contains any of the patterns
	 */
	public void replyPatient(String[] words, PrintWriter log) throws FileNotFoundException{
		
		Patterns pa = new Patterns();
		BinarySearch bs = new BinarySearch();
		Sort st = new Sort();
		SortChecker sck = new SortChecker();
		
		boolean isSorted = false;
		boolean isMatched = false;
		
		String[] pList = pa.getPatterns();
		String[] rList = pa.getDocResponse();
		st.mergeSort(pList, 0, pList.length -1);
		st.mergeSort(rList, 0, rList.length -1);
		
		isSorted = sck.check(pList);
		
		if(isSorted == false )
			System.out.println("list is not sorted");
		else{
			//idxList is use to store the index
			int[] idxList = new int[words.length];
			
			for(int i = 0; i < words.length; i++){
				idxList[i] = bs.Search(pList, words[i]);
			}
			
			Arrays.sort(idxList); // sort the index array
			
			int a = 0;
			while(a < idxList.length){
				if(idxList[a] == -1){
					isMatched = false;
					a++;
				}
				else{
					isMatched = true;
					log.println(" ");
					log.println("The word: '" + pList[idxList[a]] + "' matches with the pattern list.");
					String temp = rList[idxList[a]];
					String[] data = temp.split("-");
					
					System.out.println(data[1]);	//2.3.6 print out the response corresponding 
					log.println(data[1]);			//to the pattern
					
					a++;
				}
			}// end while loop	
			System.out.println(" ");
			log.println(" ");
		}// end if(isSorted)
		
		if(isMatched == false){
			System.out.println("random");
			log.print("random");
		}
		
		//log.close();
	}
}

/*Check if pattern list and response list are sorted  */
//System.out.println(Arrays.toString(pList));
//System.out.println(Arrays.toString(rList));

/*
//check the index array
System.out.println(Arrays.toString(idxList)); 
Arrays.sort(idxList);
System.out.println(Arrays.toString(idxList));
*/

/*
for(int i = 0; i < words.length; i++)
	System.out.println("list " + i + " is " + words[i]);
	*/
