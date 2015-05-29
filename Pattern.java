import java.util.Scanner;

public class Pattern
{

   
    public static void main(String[] args)
    {
    	/*System.out.print("Enter a number:");
    	Scanner s = new Scanner(System.in);
        int inp = s.nextInt();*/
    	for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
       
        for(int k = 6; k > 1; k--) {
            for(int l = 1; l < k - 1; l++){
                System.out.print(l);
            }
            System.out.println();
        }
        }
}