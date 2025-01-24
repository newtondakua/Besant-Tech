
package com.Banksoftware;

public class Bankdriver implements Bankfunction { 
	     static SbiBank bank=new SbiBank();

	@Override
	public void addmoney(int amount) {
		// TODO Auto-generated method stub
		int currbal=bank.getBankbalance();
		bank.setBankbalance(currbal+amount);
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		int currbal=bank.getBankbalance();
		if(amount<=currbal) {
		bank.setBankbalance(currbal-amount);
	}
		else {
			System.out.println("insufficient balance..!!");
		}
	}
	@Override
	public void Bankbalance() {
		// TODO Auto-generated method stub
		int currbal=bank.getBankbalance();
		System.out.println(currbal);
	}

}
