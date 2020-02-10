package main;
import java.util.Scanner;

import add.*;
import sub.*;
import mul.*;
import div.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	while(true)
	{
		System.out.println("1.add\n2.sub\n3.mul\n4.div");
		System.out.println("enter Your opton or if you want to end it please type \"done\":");
		Scanner s=new Scanner(System.in);
		String o=s.nextLine();
		if(o.equals("done"))
		{
			break;
		}
		System.out.print("Enter the first input number: ");
		int a=s.nextInt();
		System.out.print("Enter the second input number: ");
		int b=s.nextInt();
		switch(o)
		{
		case "1":Add a1=new Add();
				 System.out.println("The result is "+a1.add(a,b));
				 break;
		case "2":Sub s1=new Sub();
				System.out.println("The result is "+s1.sub(a,b));
				break;
		case "3":Mul m=new Mul();
				 System.out.println("The result is "+m.mul(a,b));
				 break;
		case "4":Div d=new Div();
		 		 System.out.println("The result is "+d.div(a,b));
		 		 break;
		default:System.out.println("please enter the Right option");
		}
	}
	}

}
