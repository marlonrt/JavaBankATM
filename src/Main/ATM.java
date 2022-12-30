package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Account> wallets;

    public static void main(String[] args) {
        wallets = new ArrayList<>();
        options();
    }

    public static void options() {

        System.out.println("—————————————————————————————————————————————");
        System.out.println("—————————————— Choose a Option ——————————————");
        System.out.println("—————————————————————————————————————————————");
        System.out.println("|            1 - Create Account             |");
        System.out.println("|            2 - Add Funds                  |");
        System.out.println("|            3 - Withdrawal                 |");
        System.out.println("|            4 - Transfer                   |");
        System.out.println("|            5 - List                       |");
        System.out.println("|            6 - Close                      |");
        System.out.println("—————————————————————————————————————————————");

        int option = scanner.nextInt();

        switch (option) {
            case 1 -> createAccount();
            case 2 -> addFunds();
            case 3 -> withdrawal();
            case 4 -> transfer();
            case 5 -> list();
            case 6 -> {
                System.out.print("\"Close Confirmation Message\"n");
                System.exit(0);
            }
            default -> {
                System.out.print("Invalid Option!");
                options();
            }
        }
    }

    public static void createAccount() {
            System.out.print("\nUsername: ");
            String name = scanner.next();

            System.out.print("\nIdentity Number: ");
            String idNumber = scanner.next();

            System.out.print("\nEmail: ");
            String email = scanner.next();

            Person client = new Person(name, idNumber, email);

            Account account = new Account(client);

            wallets.add(account);
            System.out.println("Account Created.");
            System.out.println(account);
            options();
        }

    private static Account findAccount(int accountId) {
        Account account = null;
        if (wallets.size() > 0) {
            for (Account acc : wallets) {
                if (acc.getAccountId() == accountId) {
                    account = acc;
                }
            }
        }

        return account;
    }

    public static void addFunds() {
        System.out.print("Account ID: ");
        int accountId = scanner.nextInt();
        Account account = findAccount(accountId);

        if(account != null) {
            System.out.print("Enter value to add: ");
            Double addValue = scanner.nextDouble();
            account.addFunds(addValue);
        } else {
            System.out.println("ID not found.");
        }

        options();
    }

    public static void withdrawal() {
        System.out.println("Account ID: ");
        int accountId = scanner.nextInt();

        Account account = findAccount(accountId);

        if(account != null) {
            System.out.print("Enter value to withdrawal: ");
            Double withdrawalValue = scanner.nextDouble();

            account.withdrawal(withdrawalValue);

        } else {
            System.out.println("ID not found.");
        }

        options();
    }

    public static void transfer() {
        System.out.println("Sender's Account ID: ");
        int senderAccountId = scanner.nextInt();

        Account senderAccount = findAccount(senderAccountId);

        if(senderAccount != null) {
            System.out.println("Account ID to transfer: ");
           int receiverAccountId = scanner.nextInt();

            Account receiverAccount  = findAccount(receiverAccountId);

            if(receiverAccount != null) {
               System.out.println("Enter value to transfer: ");
               Double value = scanner.nextDouble();
               senderAccount.transfer(receiverAccount, value);
            } else {
                System.out.println("ID not found.");
            }
        } else {
            System.out.println("ID not found.");
        }
        options();
    }

    public static void list() {
        if(wallets.size() > 0) {
            for(Account account : wallets) {
                System.out.println(account);
            }
        } else {
            System.out.println("There are no registered accounts.");
        }
        options();
    }

}
