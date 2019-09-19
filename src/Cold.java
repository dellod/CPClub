import java.util.Scanner;
import java.util.*;

public class Cold 
{
	public static void main (String[]args)
	{
		Scanner s = new Scanner(System.in);
		int n,t,count = 0;
		ArrayList<Integer> list = new ArrayList();
		try 
		{
			n = Integer.parseInt(s.nextLine());
			for(int i = 0; i < n; i++)
			{
					t = s.nextInt();
					if(t < -1000000 || t > 1000000)
					{
						System.exit(1);
					}
					list.add(t);
			}

			for(int i = 0; i < n; i++)
			{
				if(list.get(i) < 0)
					count++;
			}
			System.out.println(count);
		}
		catch(Exception e)
		{
			System.exit(1);
		}
		
		
	}
}
