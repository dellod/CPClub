package sep25;

import java.util.Scanner;
import java.util.*;

public class BookingRoom 
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int n = scan.nextInt();
		int room = 0;
		int r2 = 0;
		
		boolean[] rooms = new boolean[r];
		
		for(int i = 0; i < n; i++)
		{
			room = scan.nextInt();
			room--;
			rooms[room] = true;
		}
		
		for(int i = 0; i<r ; i++)
		{
			if(rooms[i] == false)
			{
				r2 = i + 1;
				break;
			}
		}
		if(r2 == 0)
		{
			System.out.println("too late");
			return;
		}
		System.out.println(r2);
	}
}
