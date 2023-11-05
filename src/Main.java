import model.entities.Account;
import model.exceptions.BankException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data:");
            System.out.print("Number:");
            int number = sc.nextInt();
            //System.out.println();
            System.out.print("Holder:");
            sc.nextLine();
            String holder = sc.nextLine();
            //System.out.println();
            System.out.print("Initial balance:");
            double initialBalance = sc.nextDouble();
            //System.out.println();
            System.out.print("Withdraw limit:");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw:");
            account.withdraw(sc.nextDouble());

        }catch (BankException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        }catch (RuntimeException e){
            System.out.println("Exception error");
        }






        sc.close();
    }
}