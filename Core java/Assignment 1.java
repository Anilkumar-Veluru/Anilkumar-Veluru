
import java.util.Scanner;
class A
{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int age;
	int sal;
	String design;
	void abc()
	{
		System.out.println("1). Create");
		System.out.println("2). Dispaly");
		System.out.println("3). Raise Salary");
		System.out.println("4). Exit");
		System.out.println("Choose an option?");
	}
	void inp()
	{
		System.out.println("Enter your id:");
		 id=sc.nextInt();
		System.out.println("Enteryour name:");
		name=sc.next();
		System.out.println("ENter your age: ");
		age=sc.nextInt();
		System.out.println("ENter your salary:");
		sal=sc.nextInt();
		System.out.println("Enter your Designation");
		String design=sc.next();
		D d=new D(id,name,age,sal,design);
		d.deta();
	}
}
class Z extends A
{
	void dis()
	{
		System.out.println("1.CLERK");
		System.out.println("2.DEV");
		System.out.println("3.MANAGER");
		System.out.println("4.TESTER");
		System.out.println("5.EXIT");
		System.out.println("choose your choice");
	}
}

class D extends A
{
	
	
	Asg1 a =new Asg1();
	A x=new A();
	D()
	{
		
	}
	D(int id,String name,int age,int sal,String design)
	{
		this.id=id;
		this.name=name; 
		this.age=age;
		this.sal=sal;
		this.design=design;
	}
	

	void deta()
	{
	
		System.out.println("id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+sal);
		System.out.println("Designation:"+design);
	}
	void clsalary()
	{
		int clsal=5000;
		x.inp();
		
		System.out.println("Clerk salary has raised by\n"
					+ " 5000, Hence your total salary is:"+ (x.sal+clsal));	
	}
	void testsalary()
	{
		int testsal=1000;
		x.inp();
	
		System.out.println("Tester salary has raised by\n "
		+ "1000, Hence your total salary is:"+(x.sal+testsal));
		
		
	}
	void devsalary()
	{
		int devsal=20000;
		x.inp();
		System.out.println("Tester salary has raised by\n"
		+ " 20000 ,Hence your total salary is:"+(x.sal+devsal));
		
		
	}
	void mangsalary()
	{
		int mangsal=30000;
		x.inp();
		System.out.println("Tester salary has raised by\n"
		+ " 30000 ,Hence your total salary is:"+(x.sal+mangsal));
		
		
	}
	
}
class E
{
	A x=new A();
	void emp()
	{
		System.out.println("------EMPLOYEES------");
		System.out.println("clerk");
		System.out.println("Dev");
		System.out.println("Manager");
		System.out.println("Tester");
		x.inp();
	}
	
}

import java.util.Scanner;
public class Assignment 
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch1,ch2;
		A x=new A();
		x.abc();
		int ch=sc.nextInt();
		Z y=new Z();
		
		D d=new D();
		
		if(ch==1)
		{
			y.dis();
			ch1=sc.nextInt();
		
			switch(ch1) 
			{
				case 1: x.inp();
						break;
				case 2: x.inp();
						break;
				case 3:	x.inp();
						break;
				case 4: x.inp();
						break;
				case 5:
						y.abc();
						ch2=sc.nextInt();
						x.inp();
					break;
				
			}
		}
		if(ch==2)
		{
			E e=new E();
			e.emp();
		
			
		}
		if(ch==3)
		{
			y.dis();
			ch2=sc.nextInt();
			switch(ch2)
			{
			case 1:
					d.clsalary();
					break;
			case 2: 
					d.devsalary();
					break;
			case 3:
					d.mangsalary();
					break;
			case 4: 
					d.testsalary();
					break;
			case 5: 	y.dis();
					ch2=sc.nextInt();
					x.inp();
					break;
			
					
			}
		}
		if(ch==4)
		{
			System.exit(0);
		}
	}

}


