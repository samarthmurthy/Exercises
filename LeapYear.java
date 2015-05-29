import java.util.Scanner;


public class LeapYear
{

	public static void main(String[] args)
	{
		
		System.out.print("Enter a year:");
		Scanner s = new Scanner(System.in);
		int yr=s.nextInt();
		if(yr%100==0)
		{
			if(yr%400==0)
				System.out.println("Leap Year");
			else
				System.out.println("Not a Leap Year");
		}
		else if(yr%4==0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}

}
