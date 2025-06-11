import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Transactions {
  String type;
  double amount;

  public Transactions(String type, double amount) {
    this.type = type;
    this.amount = amount;
  }

  public String toString() {
    return type + ": Rs. " + amount;
  }
}

class Account {
  String name;
  int accountNumber;
  double balance;

  ArrayList<Transactions> transactions = new ArrayList<>();

  public Account(String name, int accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.balance = balance;


    try{
            File file = new File("new.txt");
            if(file.createNewFile()){
              FileWriter writer = new FileWriter("info.txt");
                // System.out.println("File created: "+ file.getName());
            }else{
                System.out.println("File already exist.");
            }

        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
  }

  public void Deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      transactions.add(new Transactions("Deposit", amount));
      System.out.println("Deposit Succesfully");
    } else {
      System.out.println(" Invalid Amount");
    }
  }

  public void Withdrawl(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      transactions.add(new Transactions("Withdraw", amount));
      System.out.println("Withdrawl succesfully");
    } else {
      System.out.println("Insuffiecient Balance");
    }
  }

  public void viewTransactions() {
    if (transactions.isEmpty()) {
      System.out.println("no transactions yet");
    } else {
      for (Transactions t : transactions) {
        System.out.println(t);
      }
    }
  }

  public void checkBalance() {
    System.out.println("current balance" + balance);
  }
}

public class BankApp {
  static Scanner sc = new Scanner(System.in);
  static Account account;

  public static void main(String[] args) {
    System.out.println("Enter account holder name: ");
    String name = sc.nextLine();
    account = new Account(name, 1000, 0);
    System.out.println("Account created succesfully. Account Number:");

    int choice;
    do {
      System.out.println("1. Deposit\n 2. Withdraw\n 3. Balance\n 4. Transactions\n 5. Exit");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Enter amount to deposit: ");
          double dep = sc.nextDouble();
          account.Deposit(dep);
          break;

        case 2:
          System.out.println("Enter amount to withdraw: ");
          double with = sc.nextDouble();
          account.Withdrawl(with);
          break;

        case 3:
          account.checkBalance();
          break;

        case 4:
          account.viewTransactions();
          break;

        case 5:
          System.out.println("Thank you for using our Bank App.");
          break;

        default:
          System.out.println("Invalid Choice");

      }

    } while (choice != 5);

  }
}