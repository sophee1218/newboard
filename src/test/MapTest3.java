package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest3
{
	public static void main(String[] args)
	{
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "1등");
		map.put(2, "2등");
		map.put(3, "3등");
		map.put(4, "4등");
		
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		
		
		Map<Object,Integer> map2 = new HashMap<>();
		map2.put("모든", 1);
		
		Iterator<Object> it2 = map2.keySet().iterator();
		while(it2.hasNext())
		{
			Object key = it2.next();
			System.out.println(key + " : " + map2.get(key));
			
		}
		
		
		
		Map<String,Object> map3 = new HashMap<>();
		map3.put("잘하자", 100);
		
		Iterator<String> it3 = map3.keySet().iterator();
		while(it3.hasNext())
		{
			String key = it3.next();
			System.out.println(key + " : " + map3.get(key));
			
		}
		
		
		
		
		Map<String,Integer> map4 = new HashMap<>();
		map4.put("집에",90);
		
		Iterator<String> it4 = map4.keySet().iterator();
		while(it4.hasNext())
		{
			String key = it4.next();
			System.out.println(key + " : " + map4.get(key));
		}
	}
	
	
}
