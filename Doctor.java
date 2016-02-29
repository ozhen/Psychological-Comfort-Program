package cmpt213_hw3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Doctor {
	
	//counter that uses for response after greeting
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
	 * 1.Sort the lists
	 * 2.Check if they are sorted
	 * 3.Create a int array to hold the indexes that match
	 * 4.Print out those matched ones by using the int array
	 */
	public void replyPatient(String[] words, PrintWriter log) throws FileNotFoundException{
		
		//Create class objects
		Patterns pa = new Patterns();
		BinarySearch bs = new BinarySearch();
		Sort st = new Sort();
		SortChecker sck = new SortChecker();
		//Timer tm = new Timer();
		
		boolean ispListSorted = false;
		boolean isrListSorted = false;
		boolean isMatched = false;
		
		String[] pList = pa.getPatterns();
		String[] rList = pa.getDocResponse();
		
		st.sortStr(pList);
		st.sortStr(rList);
	
		ispListSorted = sck.check(pList);
		isrListSorted = sck.check(rList);
		
		if(ispListSorted == false || isrListSorted == false )
			
				System.out.println("List is not sorted");
		else{
			//idxList is use to store the index
			int[] idxList = new int[words.length];
			
			for(int i = 0; i < words.length; i++){
				//Using the library
				idxList[i] = bs.searchString(pList, words[i]);
			}
			
			//sort the index array 
			st.sortI(idxList);
			
			int a = 0;
			while(a < idxList.length){
				
				//when commands do not contain patterns
				if(idxList[a] < 0){
					isMatched = false;
					a++;
				}
				else{
					isMatched = true;
					
					//print the matched pattern in Log.txt file
					
						log.println(" ");
						log.println("The word: '" + pList[idxList[a]] + "' matches with the pattern list.");
					
					String temp = rList[idxList[a]];
					String[] data = temp.split("-");
					
						System.out.println(data[1]);	//2.3.6 print out the response corresponding 
						log.println(data[1]);			//to the pattern
					
					a++;
				}
			}// end while loop	
			
		}// end if(isSorted)
		
		if(isMatched == false){
			//default messages based on the length of the command
			if(words.length % 2 == 0){
				System.out.println("Good to know. Good to know");
				log.println("Good to know. Good to know");
			}
			else{
				System.out.println("Do not worry about it. It is all good");
				log.println("Do not worry about it. It is all good");
			}
			
		}
		
	}
		//log.close();
}

