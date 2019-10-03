
import java.util.*;

public class JOB 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	
		int n = scan.nextInt();
		int i;
		int e = 0;

		
		for(int j =0; j<n; j++)
		{
			i = scan.nextInt();
			if(i < 0)
			{
				e += i;
			}
		}
		System.out.println(Math.abs(e));
	}
}
