package com.app;
import java.util.Scanner;

public class Loan {
	int loanamt;
	int loanyears;
	String gender;
	String country;
	int age;
	String graduation;
 public static void main(String []args){
	 Loan l=new Loan();
	//Address address=new Address(address.city,address.state,address.);
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the loan type 1.Home Loan 2.Education Loan 3.Car Loan");
	int loantype=sc.nextInt();
	
	System.out.println("Please enter the loan amount");
	l.loanamt=sc.nextInt();
	
	System.out.println("Please enter the loan tenure");
    l.loanyears=sc.nextInt();
	
	System.out.println("Please enter personal Details");
	System.out.println("Enter your Name");
	String name=sc.nextLine();
	sc.nextLine();
	
	System.out.println("Enter Gender 1.Male 2.Female 3.others");
	int gend=sc.nextInt();
	   if(gend==1)
	   {
		  l.gender="Male";
	   }
	   else if(gend==2)
	   {
		  l.gender="Female";
	   }
	    else if(gend==3){
		    l.gender="others";
	    }
	   System.out.println("Enter the address");
	   System.out.println("enter the city");
	   String city=sc.nextLine();
	   
	   System.out.println("enter the state");
	   String state=sc.nextLine();
	   
	   System.out.println("enter the country");
	   l.country=sc.nextLine();
	   if(l.country.equalsIgnoreCase("India"))
	   {
		   l.country="India";
	   }
	   else{
		     
		   System.out.println("sorry we donot serve in your country");
	   }
	   System.out.println("enter the pincode");
	   int pincode=sc.nextInt();
	   
	   System.out.println("enter the age");
	   l.age=sc.nextInt();
	   
	   System.out.println("enter the Graduation Details 1.Undergraduate 2.Graduate 3.PostGraduate");
	   int grad=sc.nextInt();
	   if(grad==1)
	   {
		  l.graduation="Undergrad";
	   }
	   else if(gend==2)
	   {
		  l.graduation="Grad";
	   }
	    else if(gend==3){
		    l.graduation="PostGrad";
	   }
	   
  }
}
