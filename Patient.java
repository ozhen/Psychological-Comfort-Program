import java.io.PrintWriter;
import java.util.Scanner;

public class Patient {

	String response;
	String[] resList;
	int cnt = 0;
	
	public long Reply(PrintWriter log){
		Timer tm = new Timer();
		
		
		Scanner scan = new Scanner(System.in);
		response = scan.nextLine();
		final long start = tm.startTimer();
		cnt++;
		log.println(Integer.toString(cnt) + ".Patient: " + response);
		resList = response.split(" ");
		
		return start;
		//log.close();
		//scan.close();
	}
}
