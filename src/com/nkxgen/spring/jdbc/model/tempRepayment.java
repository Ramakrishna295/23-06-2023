package com.nkxgen.spring.jdbc.model;

public class tempRepayment {
	private int loanid;
	private double emi;
	private double interest;
	private int total;
	private int amount;
	private int complete;
	private int totalwithpenalty;

	public tempRepayment() {

	}

	public int getLoanid() {
		return loanid;
	}

	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}

	public double getEMI() {
		return emi;
	}

	public void setEMI(double emi) {
		this.emi = emi;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterset(double interest) {
		this.interest = interest;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getComplete() {
		return complete;
	}

	public void setComplete(int complete) {
		this.complete = complete;
	}

	public int getTotalWithPenalty() {
		return totalwithpenalty;
	}

	public void setTotalWithPenalty(int totalwithpenalty) {
		this.totalwithpenalty = totalwithpenalty;
	}
}
