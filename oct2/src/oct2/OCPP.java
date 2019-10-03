package oct2;

import java.util.Scanner;
import java.util.*;


public class OCPP 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int l = n - m;
		
		if(Math.abs(l) == 1)
		{
			if(l < 0)
			{
				System.out.println("Dr. Chaz will have 1 piece of chicken left over!");

			}
			else
			{
				System.out.println("Dr. Chaz needs 1 more piece of chicken!");

			}
		}
		else if(l < 0)
		{
			l *= -1;
			System.out.println("Dr. Chaz will have " + l + " pieces of chicken left over!");
		}
		else
		{
			System.out.println("Dr. Chaz needs " + l + " more pieces of chicken!");
		}
		

	}
}
