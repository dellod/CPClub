package sep25;

import java.util.Scanner;
import java.util.*;

public class SimonSays 
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner (System.in);
		int n;
		n = Integer.parseInt(scan.nextLine());
		String[] s = new String[n];
		for(int i = 0; i < n; i++)
		{
			s[i] = scan.nextLine();
		}
		
		for(int i = 0; i < n; i++)
		{
			if(s[i].contains("Simon says "))
			{
				System.out.println(s[i].substring(11));
			}
		}
	}
}
