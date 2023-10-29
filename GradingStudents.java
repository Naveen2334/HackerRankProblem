package HackerRank;

import java.util.Scanner;

public class GradingStudents {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the grade");
		int grade = sc.nextInt();
		System.out.println("Enter the no");
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			
		
		if(grade>=38)
		{
			if(grade%5>=3)
			{
				grade = ((grade/5)*5)+5;
			}
		}
		}
		System.out.println(grade);
	}

}
