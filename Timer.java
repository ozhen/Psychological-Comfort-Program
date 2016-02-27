
public class Timer {

	public long startTimer(){
		final long startTime = System.currentTimeMillis();
		return startTime;
	}
	
	public long endTimer(){
		final long endTime = System.currentTimeMillis();
		return endTime;
	}
	
	public long totalTime(long start, long end){
		final long total = end - start;
		return total;
	}
}
