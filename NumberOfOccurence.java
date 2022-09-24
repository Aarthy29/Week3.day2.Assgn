package Week3Assignment;

import java.util.Map;
import java.util.TreeMap;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class NumberOfOccurence {
	public static void main(String[] args) {
		
		int[] i={2,3,5,6,3,2,1,4,2,1,6,-1};
		
		/*
		 * Psuedcode:
		 * 
		 * 1) Create Map -> TreeMap
		 * 2) For loop -> each number -> add to the map
		 * 3) If it is exist -> update it with + 1
		 * 	  Else -> new entry with 1 as value
		 * 
		 */
		
		Map<Integer,Integer> map=new TreeMap<Integer, Integer>();
		
		for (int j : i) {
			if(map.containsKey(j))
			{
				map.put(j,map.get(j)+1);
			}
			
			else
			{
				map.put(j,1);
			}
			
			
		}
		
		System.out.println(map);
	}


}
