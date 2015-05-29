import java.util.Scanner;


public class EvenOdd 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number:");
		int c = s.nextInt();
		if(c%2==0)
			System.out.print("Even");
		else
			System.out.print("Odd");
			
		
	}

}
