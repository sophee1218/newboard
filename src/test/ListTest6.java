package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest6
{
	/*
	 * 배열
	 */
	public static void main(String[] args)

	{
		String[] strs = { "한식", "양식", "중식", "일식" };
		List<String> strList = new ArrayList<>();
		Random r = new Random();
		for (int i = 1; i <= 20; i++)
		{
			int idx = r.nextInt(strs.length);
			strList.add(strs[idx]);
		}

		int han = 0;
		int yang = 0;
		int joong = 0;
		int il = 0;
		for (int i = 0; i < 20; i++)
		{
			if ("한식".equals(strList.get(i)))
			{
				han++;
			}
		}
		for (int i = 0; i < 20; i++)
		{
			if ("중식".equals(strList.get(i)))
			{
				joong++;
			}
		}
		for (int i = 0; i < 20; i++)
		{
			if ("양식".equals(strList.get(i)))
			{
				yang++;
			}
		}
		for (int i = 0; i < 20; i++)
		{
			if ("일식".equals(strList.get(i)))
			{
				il++;
			}
		}
//		System.out.println("한식 갯수 : " + han);
//		System.out.println("중식 갯수 : " + joong);
//		System.out.println("양식 갯수 : " + yang);
//		System.out.println("일식 갯수 : " + il);
		
		
		int[] cnts = new int[4];
		for(int i=0; i<20; i++)
		{
			for(int j=0; j<strs.length; j++)
			{
				if(strList.get(i).equals(strs[j]))
				{
					cnts[j]++;
				}
			}
		}
		for(int j=0; j<strs.length; j++)
		{
			System.out.println(strs[j] + " 갯수 : " + cnts[j]);
		}
		
	}
}
