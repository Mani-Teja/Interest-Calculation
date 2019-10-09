package com.wipro.bank.acc;

public class RDAccount extends Account{

	public RDAccount(int tenure,float principal) {
		this.tenure=tenure;
		this.principal = principal;
	}
	@Override
	public float calculateInterest() {
		float p = 0.0f;
		for(int t=0;t<=60;t++) {
			p+=(principal *(float) (Math.pow((1+rateOfInterest/400),4*(t/12f)) - 1));
			
		}
		return p;
	}

	@Override
	public float calculateAmountdeposited() {
		// TODO Auto-generated method stub
		return principal*tenure*12;
	}

}
