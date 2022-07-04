package com;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;
interface N 
{
	
}

abstract class Food
{
	Scanner sc=new Scanner(System.in);
	String menu;
	String water;
	String op;
	int any;
	String ketchup;
	int rate;
	Food()
	{
		
		
		
	}
	public void display()
	{
		System.out.println("---------Welcome to FOOD FANTASY RESTAURENT--------");
		System.out.println("\nFood ordered:"+any+"\nWater bottle:"+water+"\nKethup provided:"+ketchup);
	}
	public abstract void feedback();	
	
	
}

final class Menu extends Food 
{
	public Menu()
	{
		water="Kinley";
		ketchup="Tomato ketchup";
		
	}
	public void feedback()
	{
		System.out.println(" Hope you have enjoyed your food! Please give Your Rating b/w 1-5----");
		rate=sc.nextInt();
		System.out.println("THANKYOU! VISIT AGAIN!");
		
	}
}

final class Veg extends Food
{
	public Veg()
	{
		System.out.print("\n Do U wish to see the Veg menu :");
		op=sc.next();
		System.out.println("1. LEMON RICE");
		System.out.println("2. TOMATO RICE");
		System.out.println("3. CURD RICE");
		water="Kinley";
		ketchup="Tomato ketchup";
		System.out.println("Enter your option:");
		any=sc.nextInt();
		System.out.println("Order taken! Please be patient!!!");
		
	}
	
	public void feedback()
	{
		System.out.println(" Hope you have enjoyed your food! Please give Your Rating b/w 1-5----");
		rate=sc.nextInt();
		System.out.println("THANKYOU! VISIT AGAIN!");
	}
}
final class NonVeg extends Food
{
	public NonVeg()
	{

		System.out.print("\n Do U wish to see the NonVeg menu :");
		op=sc.next();
		System.out.println("1. CHICKEN NUGGETS");
		System.out.println("2. BONE SOUP");
		System.out.println("3. FISH FRY");
		water="Kinley";
		ketchup="Tomato ketchup";
		System.out.println("Enter your option:");
		any=sc.nextInt();
		System.out.println("Order taken! Please be patient!!!");
		
	}
	public void feedback()
	{
		System.out.println(" Hope you have enjoyed your food! Please give Your Rating b/w 1-5----");
		rate=sc.nextInt();
		System.out.println("THANKYOU! VISIT AGAIN!");
		
	}
}

final class Desserts extends Food
{
	public Desserts()
	{
		System.out.print("\n Do U wish to see the Desserts menu :");
		op=sc.next();
		System.out.println("1. CHoCOLATE");
		System.out.println("2. VANILLA");
		System.out.println("3. BUTTERSCOTCH");
		water="Kinley";
		ketchup="Tomato ketchup";
		System.out.println("Enter your option:");
		any=sc.nextInt();
		System.out.println("Order taken! Please be patient!!!");
	}
	public void feedback()
	{
		System.out.println(" Hope you have enjoyed your ice cream..! Please give Your Rating b/w 1-5----");
		rate=sc.nextInt();
		System.out.println("THANKYOU! VISIT AGAIN!");
		
	}
}

public class Res
{
	public static void main(String args[])
	{
		int ch1=0,ch2=0;
		LinkedList<Food> f=new LinkedList<Food>();
		
		do
		{
			System.out.println("---------Welcome to FOOD FANTASY RESTAURENT--------");
			
			System.out.println("1.MENU");
			System.out.println("2.Display");
			System.out.println("3.Feedback!!");
			System.out.println("4.Exit");
			System.out.println("--------------------------------");
			System.out.println("Enter your Choice: ");
			Scanner sc1=new Scanner(System.in);
			ch1=sc1.nextInt();
			if(ch1==1)
			{
			do
			{
				System.out.println("--------------------------------");
				System.out.println("1.Veg");
				System.out.println("2.Non- veg");
				System.out.println("3.Desserts");
				System.out.println("4.Exit");
				System.out.println("--------------------------------");
				System.out.println("Enter your Choice: ");
				Scanner sc2=new Scanner(System.in);
				ch2=sc2.nextInt();
				switch(ch2)
				{
					case 1:
						
						f.add( new Veg () );
						
						break;
						
					case 2:
						f.add(new NonVeg());
						
						break;
					case 3: 
						f.add(new Desserts());
						break;
					
					case 4:


						System.out.println("--------------------------------");
						System.out.println("1.MENU");
						System.out.println("2.Display");
						System.out.println("3.Feedback!!");
						System.out.println("4.Exit");
						System.out.println("--------------------------------");
						System.out.println("Enter your Choice: ");
						Scanner sc3=new Scanner(System.in);
						ch1=sc3.nextInt();

						
						break;
					}
			}
			while(ch2!=4);
		}
		if(ch1==2)
		{
			Iterator i=f.iterator();
			while(i.hasNext())
			{
				Food ff=(Food) i.next();
				ff.display();
			}
			
		}
		if(ch1==3)
		{
			Iterator v=f.iterator();
			while(v.hasNext())
			{
				
				Food cc=(Food) v.next();
				cc.feedback();
			}
		}
	}
		while(ch1!=4);
		
	}
}
