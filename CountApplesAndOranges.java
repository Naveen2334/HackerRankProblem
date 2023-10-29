package HackerRank;

import java.util.List;

public class CountApplesAndOranges {
	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
	    // Write your code here
	    int tot_apple = 0;
	    int tot_oranges = 0;
	    for(int i = 0; i <apples.size();i++)
	    {
	        int d  = apples.get(i);
	        int pos = d+a;
	        if(pos >=s && pos<=t) tot_apple++;
	    }
	    for(int i = 0;i<oranges.size();i++)
	    {
	        int d = oranges.get(i);
	        int pos = d+b;
	        if(pos>=s && pos<=t) tot_oranges++;
	    }
	    System.out.println(tot_apple);
	    System.out.println(tot_oranges);

	    }
	public static void main(String[] args) {
		
	}


}
