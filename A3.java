package cmpt213_hw3;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

/*
 * 1.Doctor greets
 * 2.Patient responds
 * 3.doctor responds
 * 		-check patient's input
 * 4.Repeat until the patient responds 'no'
 */
public class A3 {
	
	public static void main(String[] args)throws FileNotFoundException{
		
		Doctor Dr = new Doctor();
		Patient pat = new Patient();
		Timer tm = new Timer();
		int i = 0;
			
		PrintWriter log = new PrintWriter("Log.txt");
		
		while(i < 1){
			Dr.Greeting();
			final long start = pat.Reply(log);
			
			if(pat.response.equals("no") == true){
				i++;
			}
			else{
				Dr.replyPatient(pat.resList,log);
				final long end = tm.endTimer();
				final long total =tm.totalTime(start, end);
					
				System.out.println("Total execution time: " + total + "ms.");
				log.println("Total execution time: " + total + "ms.");
				System.out.println(" ");
				log.println(" ");
						
				}			
			}// end of while loop
		
		log.close();	
		
	} // end of Main
	
}// end of A3
