import java.util.Scanner;


public class R2
{
	public static void main(String[]args)
	{
		int r1, s1;
		String s;
		Scanner scan = new Scanner(System.in);
		try
		{
			r1 = scan.nextInt();
			if(r1 > 1000 || r1 < -1000)
			{
				System.exit(1);
			}
			s1 = scan.nextInt();
			if(s1 > 1000 || s1 < -1000)
			{
				System.exit(1);
			}
			
			System.out.println((2*s1) - r1);
		}
		catch(Exception e)
		{
			System.exit(1);
		}
	
		
	}
}
