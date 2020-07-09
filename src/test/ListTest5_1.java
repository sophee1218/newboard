package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Food2
{
	private String name;
	private int price;
	private String locale;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public String getLocale()
	{
		return locale;
	}

	public void setLocale(String locale)
	{
		this.locale = locale;
	}

	@Override
	public String toString()
	{
		return "Food [name=" + name + ", price=" + price + ", locale=" + locale + "]";
	}
}

public class ListTest5_1
{
	/*
	 * 음식 가격은 천원부터 만원까지. 단 천단위로 이루어져야함.
	 * 
	 * 제일 비싼 음식과 제일 저렴한 음식을 찾아서 출력.
	 */

	public static void main(String[] args)
	{
		List<Food2> fList = new ArrayList<>();
		String[] locales = { "한식", "양식", "중식", "일식", "분식", "경양식" };
		Random r = new Random();

		for (int i = 1; i <= 30; i++)
		{
			Food2 f = new Food2();
			f.setLocale(locales[r.nextInt(locales.length)]);
			f.setName("음식" + i);
			f.setPrice((r.nextInt(10) + 1) * 1000);
			fList.add(f);

		}
//		int han = 0;
//		int yang = 0;
//		int joong = 0;
//		int il = 0;
//		int boon = 0;
//		int kyeong = 0;

		int[] nums = new int[locales.length];
		for (int i = 0; i < locales.length; i++)
		{
			for (int j = 0; j < fList.size(); j++)
			{
				if (locales[i].equals(fList.get(j).getLocale()))
				{
					nums[i]++;
				}
			}
		}
		for(int i = 0; i<locales.length; i++)
		{
			System.out.println(locales[i] + " 갯수 : " + nums[i]);
		}

	}
}
