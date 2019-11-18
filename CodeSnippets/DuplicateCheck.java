package general_programs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCheck
{
	public static void main(String[] args)
	   {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String character = sc.nextLine();
		char y[] = character.toCharArray();
		int size = y.length;
		
		System.out.println("Entered string is: "+character);
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		int i= 0;
		while(i != size)
		{
			if(map.containsKey (y[i] )== false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int oldval = map.get(y[i]);
				int newval = oldval +1 ;
				map.put(y[i], newval);
			}
			i++;
			
		}
		
		Set<Map.Entry<Character,Integer>> lhmap = map.entrySet();
		for(Map.Entry<Character, Integer> data : lhmap)
		{
			if(data.getValue() > 1)
			{
			 System.out.println(data.getKey() +" - "+data.getValue());
			
			 
			}
		}
		

	   }
	
}


