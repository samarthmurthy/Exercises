import java.util.Scanner;


public class ArayRev {

	public static void main(String[] args) 
	{
		int[] rev=new int[10];
		//Scanner s = new Scanner(System.in);
		//System.out.print("Enter 10 numbers:");
		for(int i=0;i<rev.length;i++)
		{
			//i=s.nextInt;
			rev[i]=i;
			System.out.print("");
		}
		System.out.println("Reversed String:");
		for(int j=rev.length-1;j>0;j--)
		{
			System.out.print(rev[j]+"\t");
		}
	}
}
	
		

