package HackerRank;

public class TemperatureConversion {
	public static String timeConversion(String s) {
	    // Write your code here
	    String start = s.substring(0, 2) , end = s.substring(2, 8);
	    int hours = Integer.parseInt(start);
	    if(s.contains("P")&& hours < 12)
	    {
	      hours += 12;
	      start = String.valueOf(hours);  
	    }
	    else if(s.contains("A")&& hours == 12){
	        start = "00";
	        
	    }
	    s=start+end;
	    return s;
	    

	    }

	public static void main(String[] args) {
		
	}

}
