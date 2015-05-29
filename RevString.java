import java.util.*;

public class RevString {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string:");
		String inp=s.next();
		inp=inp+" ";
		String rev=" ";
		for(int i=0;i<inp.length();i++)
		{
			char ch = inp.charAt(i);
			if(ch == ' ')
				System.out.println(rev);
			else
				rev=ch+rev;
		}
	}

}
