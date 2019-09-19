import java.util.Scanner;

import java.util.*;

public class StuckInTimeLoop 
{
	public static void main(String[]args)
	{
		int n;
		System.out.println();
		Scanner scan = new Scanner(System.in);
		try 
		{
			n = Integer.parseInt(scan.nextLine());
			if(n <= 100 && n > 0)
			{
				for(int i = 0; i < n; i++)
				{
					System.out.println((i+1) + " Abracadabra");
				}
			}
			else
			{
				System.exit(1);
			}
		}
		catch(Exception e)
		{
			System.exit(1);
		}
		
		
	}
}
