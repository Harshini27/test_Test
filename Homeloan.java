package com.app;
import java.util.Scanner;
public class Homeloan{
	int roi;
	Homeloan(int roi)
	{
		this.roi=roi;
	}
	Loan l1=new Loan();
	public void home()
	{
		Scanner sc=new Scanner(System.in);
		if(l1.gender.equals("Male"))
		{
			if(l1.graduation.equals("Grad") && l1.age>60)
			{
				System.out.println("80% of your loan is approved"+((80*l1.loanamt)/100));
				System.out.println("1.accept 2.reject");
				int accept=sc.nextInt();
			}
			else if(l1.graduation.equals("Undergrad") && l1.age>35)
			{
				System.out.println("60% of your loan is approved"+((60*l1.loanamt)/100));
			}
		}
		else if(l1.gender.equals("Female"))
		{
			if(l1.graduation.equals("Grad") && l1.age>55)
			{
				System.out.println("80% of your loan is approved"+((80*l1.loanamt)/100));
			}
			else if(l1.graduation.equals("Undergrad") && l1.age>30)
			{
				System.out.println("60% of your loan is approved"+((60*l1.loanamt)/100));
			}
		}
		if(l1.graduation.equals("Postgrad"))
		{
			System.out.println("80% of your loan is approved"+((80*l1.loanamt)/100));
		}
	}
}
       
