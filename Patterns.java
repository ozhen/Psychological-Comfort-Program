import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Patterns {

	int numPatterns, numResponses;
	int cnt = 0;
	
	public String[] getPatterns()throws FileNotFoundException{
		
		File PatternsFile = new File("hw3_patterns.txt");
		Scanner scan = new Scanner(PatternsFile);
		
		String str = scan.nextLine();   		
		numPatterns = Integer.parseInt(str); 
		
		String[] patternList = new String[numPatterns];
		
		for(int i = 0; i < numPatterns; i++){
			str = scan.nextLine();
			patternList[i] = str;
		}
		
		
		scan.close();
		return patternList;
	}
	
	public String[] getDocResponse()throws FileNotFoundException{
		
		File ResponsesFile = new File("hw3_responses.txt");
		Scanner scan = new Scanner(ResponsesFile);
		
		String str = scan.nextLine();   		
		numResponses = Integer.parseInt(str);
		
		String[] responsesList = new String[numResponses];
		
		for(int i = 0; i < numResponses; i++){
			str = scan.nextLine();
			responsesList[i] = str;
		}
		
		scan.close();
		return responsesList;
	}
}


/*while (scan.hasNext())
{
	String str	= scan.nextLine();
	//System.out.println(str);
	patternList[] = str;
	cnt++;
}
*/