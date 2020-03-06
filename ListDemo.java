import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo 
{
	public static void main(String args[])
	{
		ArrayList a1 = new ArrayList( );
		
		//initialized array with 10 elements
		a1.add(" India ");
		a1.add(" Japan ");
		a1.add(" India ");
		a1.add(" New Zeland ");
		a1.add(" China ");
		a1.add(" Germany ");
		a1.add(" Paris ");
		a1.add(" Russia ");
		a1.add(" China ");
		a1.add(" Canada ");
		
		System.out.println("PRINTING INITIALE ARRAY");
		Iterator i = a1.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
		//removing elemnt
		System.out.println("--------------------");
		System.out.println("DELETING JAPAN ELEMENT");
		a1.remove(" Japan ");
		Iterator i1 = a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		//Fetching data
		System.out.println("--------------------");
		System.out.println("FETCHING DATA OR SEARCHING");
		if(a1.contains(" India "))
		{
			System.out.println("Search found");
		}
		else 
		{
			System.out.println("Search not found");
		}
		
		//adding new elements
		System.out.println("--------------------");
		System.out.println("ADDING NEW ELEMENTS AND PRINTING");
		a1.add(" Pakistan ");
		a1.add(" Pakistan ");
		a1.add(" Pakistan ");
		Iterator i2 = a1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
	}
}
