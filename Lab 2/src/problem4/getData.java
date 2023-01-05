package problem4;

import java.util.Scanner;

import problem4Correct.Account;
import problem4Correct.Bank;
import problem4Correct.CheckingAccount;
import problem4Correct.SavingAccount;

public class getData {
	Scanner in = new Scanner(System.in);
	private int num;
	private double money;
	private double interestRate;
	private String check;
	private String type;
	private int a;
	private double sum;
	private int n;
	getData(){
		setData();
	}
	public void setData() {
		System.out.println("Do you want to create Account, SavingAccount or CheckingAccount?");
		setAccount(in.next());
		if(getAccount().equals("Account")) {
			System.out.println(menu());
			setValues();
			Account object = new Account(num,money);
			if(check.equals("Yes")) {
				System.out.println("Input number of operations");
				numberOfOperations(in.nextInt());
				while(n > 0) {
					System.out.println(doOperation());
					String operation = in.next();
					checking(operation);
					if(operation.equals("transfer")) {
						boolean ok = false;
						for(int i = 0; i < Bank.v.size(); i++) {
							if(Bank.v.get(i).getAccountNumber() == a) {
								object.transfer(sum,Bank.v.get(i));
								ok = true;
							}
						}
						if(ok == false) {
							System.out.println("We don't have this user");
						}
					}
					if(operation.equals("withdraw")) {
						object.withdraw(sum);
					}
					n--;
				}
			}
			Bank.v.add(object);
		}
		if(getAccount().equals("SavingAccount")) {
			System.out.println(menu() + " and interest rate");
			setValues();
			SavingAccount object = new SavingAccount(num,money,interestRate);
			if(check.equals("Yes")) {
				System.out.println("Input number of operations");
				numberOfOperations(in.nextInt());
				while(n > 0) {
					System.out.println(doOperation() + "or deposit");
					String operation = in.next();
					if(operation.equals("transfer")) {
						checking(operation);
						boolean ok = false;
						for(int i = 0; i < Bank.v.size(); i++) {
							if(Bank.v.get(i).getAccountNumber() == a) {
								object.transfer(sum,Bank.v.get(i));
								ok = true;
							}
						}
						if(ok == false) {
							System.out.println("We don't have this user");
						}
				
					}
					if(operation.equals("withdraw")) {
						checking(operation);
						object.withdraw(sum);
					}
					if(operation.equals("deposit")) {
						object.deposit();
					}
					n--;
				}
			}
			Bank.v.add(object);
		}
		if(getAccount().equals("CheckingAccount")) {
			System.out.println(menu());
			setValues();
			CheckingAccount object = new CheckingAccount(num,money); 
			if(check.equals("Yes")) {
				System.out.println("Input number of operations");
				numberOfOperations(in.nextInt());
				while(n > 0) {
					System.out.println(doOperation());
					String operation = in.next();
					checking(operation);
					if(operation.equals("transfer")) {
						boolean ok = false;
						for(int i = 0; i < Bank.v.size(); i++) {
							if(Bank.v.get(i).getAccountNumber() == a) {
								object.transfer(sum,Bank.v.get(i));
								ok = true;
							}
						}
						if(ok == false) {
							System.out.println("We don't have this user");
						}
					}
					if(operation.equals("withdraw")) {
						object.withdraw(sum);
					}
					n--;
				}
			}
			Bank.v.add(object);
		}
	}
	public void numberOfOperations(int n) {
		this.n = n;
	}
	public void checking(String operation) {
		System.out.println("Enter amount of money ");
		this.sum = in.nextDouble();
		if(operation.equals("transfer")) {
			System.out.println("Number of Account");
			this.a = in.nextInt();
		}
	}
	public void setValues() {
		this.num = in.nextInt();
		this.money = in.nextDouble();
		if(getAccount().equals("SavingAccount")) {
			this.interestRate = in.nextDouble();
		}
		System.out.println("Do you want to do some operations with money?(Yes/No)");
		check = in.next();
	}
	public String doOperation() {
		return "Do you want to transfer money or withdraw money";
	}
	public String menu() {
		return "Input account number and money";
	}
	public void setAccount(String type) {
		this.type = type;
	}
	public String getAccount() {
		return this.type;
	}
}
