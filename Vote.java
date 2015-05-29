import java.util.Scanner;


public class Vote 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = s.nextInt();
		if(age>=18)
			System.out.println("Valid Voter");
		else
			System.out.println("Invalid Voter");
	}
	

}
