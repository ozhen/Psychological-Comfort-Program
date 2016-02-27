
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class A3 {
	
	public static void main(String[] args)throws FileNotFoundException{
		
		BinarySearch bin = new BinarySearch();
		Sort st = new Sort();
		SortChecker sc = new SortChecker();
		Patterns pa = new Patterns();
		Doctor dr = new Doctor();
		Patient pat = new Patient();
		Timer tm = new Timer();
		
		int target,index;
		int i = 0;
		int[] arr = {38, 27, 43, 3, 9, 82, 10};	
		
		boolean isSorted;
		
		PrintWriter log = new PrintWriter("Log.txt");
		
		/*
		 * doctor greets
		 * patient responds
		 * doctor responds
		 * 		check patient's input
		 * 		
		 */
		//loop until the patient responds 'no'
		
		
	
		//main
		while(i < 1){
			dr.Greeting();
			pat.Reply(log);
		
			if(pat.response.equals("no") == true){
				i++;
			}
			else{
				dr.replyPatient(pat.resList,log);	
			}
		}
		
		log.close();
		
	} // end of Main
}// end of A3


/*
String zzz = "My life sucks";
String[] zz = zzz.split(" ");
System.out.println(zz.length);

for(int i = 0; i < zzz.length(); i ++)
	System.out.println(zz[i]);
*/

/*
//check contains and equal methods
String str1 = "How are you m8?";
String str2 = "you";
String str3 = "m8";

System.out.println(str1 + " contains " + str2 + " is " + str1.contains(str2));
System.out.println(str1 + " contains " + str3 + " is " + str1.contains(str3));
System.out.println(str3.compareTo(str2));
*/


/*	//check getPatterns method from Patterns Class
String[] abc = pa.getPatterns();
boolean t = pa.patternsContain(abc, "hello but");
System.out.println(Arrays.toString(abc));
System.out.println(Integer.toString(pa.numPatterns));
System.out.println(t);
*/


/*
 * check binary search
 
//String array
String[] abc = pa.getPatterns();
System.out.println(Arrays.toString(abc));
st.mergeSort(abc,0,abc.length - 1);
System.out.println(Arrays.toString(abc));
isSorted = sc.check(abc);
System.out.println("the patterns are sorted: " + isSorted);

String tar = "bu";
index = bin.Search(abc, tar);

if(index == -1)
	System.out.println("The word " + tar + " is not found!");
else
	System.out.println("Find " + tar + " at index " + index); 
  
//int array
target = 9;
index = bin.Search(arr, target);
System.out.println("Find " + target + " at index " + index);
*/

/*
//sort array and check if it is sorted
//String array
String[] abc = pa.getPatterns();
System.out.println(Arrays.toString(abc));
st.mergeSort(abc,0,abc.length - 1);
System.out.println(Arrays.toString(abc));
isSorted = sc.check(abc);
System.out.println(isSorted);
  
//int arr 
st.mergeSort(arr,0,arr.length - 1);
isSorted = sc.check(arr);
//check if it is sorted
System.out.println(Arrays.toString(arr));
System.out.println(isSorted);
*/

/*
//testing the timer class.
final long start = tm.startTimer();
while(i < 1000000){
	i++;
}
final long end = tm.endTimer();
final long total =tm.totalTime(start, end);
System.out.println("Total execution time: " + total);
*/
