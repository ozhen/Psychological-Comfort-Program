import java.io.PrintWriter;
import java.util.Scanner;

public class Patient {

	String response;
	String[] resList;
	int cnt = 0;
	
	public void Reply(PrintWriter log){
		Scanner scan = new Scanner(System.in);
		response = scan.nextLine();
		cnt++;
		log.println(Integer.toString(cnt) + ".Patient: " + response);
		resList = response.split(" ");
		
		//log.close();
		//scan.close();
	}
}
