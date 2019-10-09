package com.wipro.bank.main;
import java.util.Scanner;
import com.wipro.bank.service.*;
public class MainClass {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int age,tenure,principalamount;
		System.out.println("Enter your age");
		age=sc.nextInt();
		System.out.println("Enter your Gender");
		String gender=sc.next();
		System.out.println("Enter fixed amount you want to deposit per month (minimum of Rs. 500)");
		principalamount=sc.nextInt();
		System.out.println("Enter the tensure period ( 5 OR 10 )");
		tenure=sc.nextInt();
        BankService b=new BankService();
        b.calculate(principalamount, tenure, age, gender);
        sc.close();
	}
}
