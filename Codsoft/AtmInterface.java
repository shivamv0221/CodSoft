package Codsoft;
import java.util.*;
class uersbankacc{
	private double bal;
	public uersbankacc(double basebal) {
		this.bal=basebal;
	}
	public double getbal(){
		return bal;
	}
	public void deposit(double amt) {
		if(amt>0) {
			bal+=amt;
			System.out.println("Deposited Successfully! Current Balance :"+bal);
		}else {
			System.out.println("Please enter valid amount to depsite...!");
		}
	}
	public void withdraw(double amt) {
		if(amt>0&&amt<=bal) {
			bal-=amt;
			System.out.println("Withdrawl Successfull! Current Balance :"+bal);
		}else {
			System.out.println("Insufficient balance...!");
		}
	}
}
class ATMFUN{
	private uersbankacc acc;
	Scanner sc=new Scanner(System.in);
	public ATMFUN(uersbankacc acc) {
		this.acc=acc;
	}
	public void functions() {
		System.out.println("1: Display Balance");
		System.out.println("2: Deposit Amount");
		System.out.println("3: Withdraw Amount");
		System.out.println("4: Exit");
	}
	
	public void run() {
		int choice;
		do{
			functions();
			System.out.print("Enter your choice : ");
			choice=sc.nextInt();
					switch(choice) {
					case 1: checkbal();
							break;
					case 2: deposit();
							break;
					case 3:withdraw();
							break;
					case 4: System.out.println("Thankyou for banking with us!");
							break;
					default:System.out.println("Enter valid choice...!");
					}
		}while(choice!=4);
	}
	
	private void checkbal() {
		System.out.println("Your current balance is : "+acc.getbal());
	}
	private void deposit() {
		System.out.println("Enter the amount to deposit : ");
		double amt=sc.nextDouble();
		acc.deposit(amt);
	}
	private void withdraw() {
		System.out.println("Enter the amount to withdraw : ");
		double amt=sc.nextDouble();
		acc.withdraw(amt);
	}
}
public class AtmInterface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to our ATM INTERFACE!");
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter your safety pin : ");
		int safepin=sc.nextInt();
		
		uersbankacc uacc=new uersbankacc(500.0);
		ATMFUN atmfun=new ATMFUN(uacc);
		atmfun.run();
	}
	
}


