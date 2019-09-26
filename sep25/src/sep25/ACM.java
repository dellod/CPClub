package sep25;

import java.util.Scanner;
import java.util.*;

public class ACM 
{	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		ArrayList<Character> list = new ArrayList<Character>();
		ArrayList<Character> klist = new ArrayList<Character>();
		ArrayList<Character> f = new ArrayList<Character>();
		String e = scan.nextLine();
		String key = scan.nextLine();
		int o = klist.size();
		for(int i = 0; i < e.length(); i++)
		{
			list.add(e.charAt(i));
		}
		
		for(int i = 0; i < key.length(); i++)
		{
			klist.add(key.charAt(i));
		}
		int i=0;
		while(true)
		{
			
			int m = klist.get(i) - 65;
			int n = list.get(i) - m;
			if(n < 65)
			{
				n += 26;
			}
			char c = (char) (n);
			
			klist.add(c);
			f.add(c);
			
			i++;

			if(f.size() == list.size()) break;
		}
		for(int j = 0; j < f.size(); j++)
		{
			System.out.print(f.get(j));
		}
		
	}
	
	
}
