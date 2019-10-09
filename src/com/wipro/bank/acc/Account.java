package com.wipro.bank.acc;

public abstract class Account {

	int tenure;
	float principal;
	float rateOfInterest;
	public void setInetrest(int age,String gender) {
		if(gender.equalsIgnoreCase("Male")) {
			if(age<60) this.rateOfInterest = 9.8f ;
			else this.rateOfInterest = 10.5f ;
		}
		else {
			if(age < 58 ) this.rateOfInterest = 10.2f;
			else this.rateOfInterest = 10.8f ; 
		}
	}
	
	public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityinterest) {
		return totalPrincipleDeposited + totalPrincipleDeposited;
	}
	
	public abstract float calculateInterest();
	
	public abstract float calculateAmountdeposited();
}
