package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Food
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

public class ListTest5_0
{
	/*
	 * 음식 가격은 천원부터 만원까지. 단 천단위로 이루어져야함.
	 * 
	 * 제일 비싼 음식과 제일 저렴한 음식을 찾아서 출력.
	 */

	public static void main(String[] args)
	{
		List<Food> fList = new ArrayList<>();
		String[] locales = { "한식", "양식", "중식", "일식", "분식", "경양식" };
		Random r = new Random();

		for (int i = 1; i <= 30; i++)
		{
			Food f = new Food();
			f.setLocale(locales[r.nextInt(locales.length)]);
			f.setName("음식" + i);
			f.setPrice((r.nextInt(10) + 1) * 1000);
			fList.add(f);

		}

		int max = 0;
		int idx = 0;
		int min = 0;
		int idx2 = 0;

		for (int i = 0; i < fList.size(); i++)
		{
			Food f = fList.get(i);
			if (max < f.getPrice())
			{
				max = f.getPrice();
				idx = i;
			}
			
		}
		
		for (int i = 0; i < fList.size(); i++)
		{
			Food f = fList.get(i);
			
			if (min==0||min > f.getPrice())
			{
				min = f.getPrice();
				idx2 = i;
			}

		}	
		for(int i=0; i<fList.size(); i++ )
		{
			if(max==idx);
		}
		
		System.out.println("제일 비쌈 : " + fList.get(idx));

		System.out.println("제일 쌈 : " + fList.get(idx2));

	}
}