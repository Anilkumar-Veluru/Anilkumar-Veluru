package com;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
interface H
{
	
}

abstract class Hostel
{
	Scanner sc=new Scanner(System.in);
	String name,wname,sname;
	String course;
	int id,wid,salary;
	int roomno,wroomno;
	int f;
	String sshift;
	Hostel()
	{
		
		
		
	}
	public void display()
	{
		System.out.println("---------Vidya PG welcomes you--------");
		System.out.println("\nStudent Name:"+name+"\nId:"+id+"\nRoomno:"+roomno);
	}
	public void display1()
	{
		System.out.println("\nWarden Name:"+wname+"\nId:"+wid+"\nSalary:"+salary+"\nRoomNo:"+wroomno);
	}
	public void display2()
	{
		System.out.println("\nSecurity Name:"+sname+"\nShift:"+sshift);
	}
	
	public abstract void RoomNo();	
	
	
}

final class CreateDetails extends Hostel
{
	public CreateDetails()
	{
	roomno= 001;
	}
	public void RoomNo()
	{
		System.out.println("There are four Floors");
		System.out.println("Choose the Floor");
		f=sc.nextInt();
		System.out.println("Room Confirmed in the Floor"+f);
		
	}
}

final class Student extends Hostel
{
	public Student()
	{
		System.out.println("1.Enter Student ID :");
		id=sc.nextInt();
		System.out.println("2.Enter Student Name :");
		name=sc.next();
		System.out.println("3.Enter your Course");
		course=sc.next();
		System.out.println("4.Enter Student Year :");
		id=sc.nextInt();
		
		
		
	}
	
	public void RoomNo()
	{
		System.out.println("There are four Floors");
		System.out.println("Choose the Floor");
		f=sc.nextInt();
		System.out.println("Room Confirmed in the Floor"+f);
	}
}
final class Warden extends Hostel
{
	public Warden()
	{

		System.out.print("1.Enter Warden Name :");
		wname=sc.next();
		System.out.println("2.Enter Age :");
		wid=sc.nextInt();
		System.out.println("3.Enter Salary :");
		salary=sc.nextInt();
		System.out.println("Enter Warden RoomNO:");
		wroomno=sc.nextInt();
		
	}
	public void RoomNo()
	{
		System.out.println("There are four Floors");
		System.out.println("Choose the Floor");
		f=sc.nextInt();
		System.out.println("Room Confirmed in the Floor"+f);	
	}
}

final class Security extends Hostel
{
	public Security()
	{
		System.out.println("1.Enter Name :");
		sname=sc.next();
		System.out.println("2.Enter Shift");
		sshift=sc.next();
		
	}
	public void RoomNo()
	{
		System.out.println("There are four Floors");
		System.out.println("Choose the Floor");
		f=sc.nextInt();
		System.out.println("Room Confirmed in the Floor"+f);		
	}
}

public class Host
{
	public static void main(String args[])
	{
		int ch1=0,ch2=0;
		ArrayList<Hostel> cl=new ArrayList<Hostel>();
		
		do
		{
			
			
			System.out.println("1.Create Details");
			System.out.println("2.Display");
			System.out.println("3.RoomNO");
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
				System.out.println("1.Student");
				System.out.println("2.Warden");
				System.out.println("3.Security");
				System.out.println("4.Exit");
				System.out.println("--------------------------------");
				System.out.println("Enter your Choice: ");
				Scanner sc2=new Scanner(System.in);
				ch2=sc2.nextInt();
				switch(ch2)
				{
					case 1:
						
						cl.add( new Student());
						Iterator i=cl.iterator();
						while(i.hasNext())
						{
							Hostel kk=(Hostel) i.next();
							kk.display();
						}
						break;
						
					case 2:
						cl.add(new Warden());
						Iterator t=cl.iterator();
						while(t.hasNext())
						{
							Hostel tt=(Hostel) t.next();
							tt.display1();
						}
						
						
						break;
					case 3: 
						cl.add(new Security());
						Iterator m=cl.iterator();
						while(m.hasNext())
						{
							Hostel tt=(Hostel) m.next();
							tt.display2();
						}
						break;
					
					case 4:


						System.out.println("--------------------------------");
						System.out.println("1.Create Details");
						System.out.println("2.Display");
						System.out.println("3.RoomNO");
						System.out.println("4.Exit");
						System.out.println("--------------------------------");
						System.out.println("Enter your Choice: ");
						Scanner sc3=new Scanner(System.in);
						ch1=sc3.nextInt();

						
						break;
					}
			}
			while(ch2!=4);
			if(ch1==2)
			{
				Iterator i=cl.iterator();
				while(i.hasNext())
				{

					Hostel hh=(Hostel) i.next();
					hh.display();
				}
				}
			}
		
		if(ch1==3)
		{
			Iterator u=cl.iterator();
			while(u.hasNext())
			{
				
				Hostel y=(Hostel) u.next();
				y.RoomNo();
			}
		}
	}
		while(ch1!=4);
		
	}
}