package com;

public class AccountHolder {
public void details() {
	System.out.println("account details are here");
	String bankName="Sbi";
	double bal=25000.56;

}
public static void main(String[] args) {
	AccountHolder a=new AccountHolder();
	a.details();
}
}
