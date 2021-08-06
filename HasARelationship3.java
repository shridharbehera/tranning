package com.techment.day5.oops;

class Customer
{
	int custid;
	String cusname;
	Account account;
	public Customer(int custid, String cusname, Account account) {
		super();
		this.custid = custid;
		this.cusname = cusname;
		this.account = account;
	}
	void displayBankInfo()
	{
		System.out.println("custid: "+custid);
		System.out.println("cusname: "+cusname);
		System.out.println("accountno: "+account.accountno);
		System.out.println("accounttype: "+account.accounttype);
		System.out.println("ifsc: "+account.ifsc);
		System.out.println("branch: "+account.branch);
		
	}
}
class Account
{
	int accountno;
	String accounttype;
	int balance;
	String ifsc;
	String branch;
	public Account(int accountno, String accounttype, int balance, String ifsc, String branch) {
		super();
		this.accountno = accountno;
		this.accounttype = accounttype;
		this.balance = balance;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	
	
}

public class HasARelationship3 {

	public static void main(String[] args) {
		
		Account acc=new Account(101,"saving",1000,"sbin00006154","bhilai");
		Customer cus=new Customer(01,"shridhar",acc);
		cus.displayBankInfo();



	}

}
