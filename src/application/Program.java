package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	try {	
		System.out.println("Enter account Data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withDrawLimit = sc.nextDouble();
		System.out.println();
		
		Account account = new Account(number, holder, balance, withDrawLimit);
		System.out.print("Enter amount for witdraw: ");
		double amount = sc.nextDouble();
		
		
			account.withdraw(amount);
			System.out.println("New balance: "+ String.format("%.2f",account.getBalance()));
		}
		
		catch (DomainException e){
			System.out.println("WithDraw error: "+ e.getMessage());
		}
		
		catch (RuntimeException e){
			System.out.println("Inexperate error !");
		}
		finally {						
		sc.close();
		}
	}

}
