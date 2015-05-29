import java.util.Scanner;
public class VowelConst 
{

	public static void main(String[] args) 
	{
		System.out.print("Enter a letter:");
		Scanner s = new Scanner(System.in);
		char lett;
		String i = s.next();
		lett=i.charAt(0);
		if(lett=='a'||lett=='A'||lett=='e'||lett=='E'||lett=='i'||lett=='I'||lett=='o'||lett=='O'||lett=='u'||lett=='U')
           System.out.println("Vowel");
		else
			System.out.println("Consonant");
	}

}
