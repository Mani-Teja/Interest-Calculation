package com.wipro.bank.service;
import com.wipro.bank.exception.*;
import com.wipro.bank.acc.*;
public class BankService {

	public boolean validateData(float principal, int tenure,int age, String gender) {
		if(principal <500 || (tenure!=5 && tenure!=10) || (!(gender.equalsIgnoreCase("Male")) && (!gender.equalsIgnoreCase("female"))) || (age<1 && age>100)) {
			BankValidationException b = new BankValidationException();
			System.out.println(b);
			return false;
		}
		else return true;
	}
	
	public void calculate(float principal,int tenure, int age, String gender) {
		if(validateData(principal,tenure,age,gender)) {
			RDAccount r = new RDAccount(tenure,principal);
			r.setInetrest(age, gender);
			float interest=r.calculateInterest(),to=r.calculateAmountdeposited();
			System.out.println("Interest :"+interest);
			System.out.println("Amount Deposited: "+to);
			System.out.println("Maturity Amount :"+r.calculateMaturityAmount(to, interest));
		}
	}
}