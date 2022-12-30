package Main;

import Utilities.Utils;

public class Account {


    private static int idCounter = 1;

    private int accountId;
    private Person person;
    private Double funds = 0.0;

    public Account(Person person) {
        this.accountId = Account.idCounter;
        this.person = person;
        this.updateFunds();
        Account.idCounter += 1;
    }

    public int getAccountId () {
        return accountId;
    }
    public Person getClient() {
        return person;
    }
    public void setClient(Person person) {
        this.person = person;
    }
    public Double getFunds() {
        return funds;
    }
    public void setFunds(Double funds) {
        this.funds = funds;
    }

    private void updateFunds() {
        this.funds = this.getFunds();
    }

    public String toString() {
        return "\nAccount ID: " + this.getAccountId() +
        "\nClient: " + this.person.getName() +
        "\nIdentity Number: " + this.person.getIdNumber() +
        "\nEmail: " + this.person.getEmail() +
        "\nFunds: " + Utils.doubleToString(this.getFunds()) + "\n";
    }

    public void addFunds (Double value) {
        if(value > 0) {
            setFunds(getFunds() + value);
            System.out.println("\n" +
                    Utils.doubleToString(value) +
                    " has been added. \n");
        } else {
            System.out.println("Your transaction cannot be completed.");
        }
    }

    public void withdrawal(Double value) {
        if(value > 0 && this.getFunds() >= value) {
            setFunds(getFunds() - value);
            System.out.println("\n" +
                    Utils.doubleToString(value) +
                    " has been withdrawn. \n");
        } else {
            System.out.println("Your transaction cannot be completed.");
        }
    }

    public void transfer(Account payee, Double value) {

        if(value > 0 && this.getFunds() >= value) {
            setFunds(getFunds() - value);
            payee.funds = payee.getFunds() + value;
            System.out.println("\n" +
                    Utils.doubleToString(value) +
                    " was transfered from Account ID: " +
                    accountId + "\nTo " +
                    payee.accountId + "\n");
        } else {
            System.out.println("Your transaction cannot be completed.");
        }
    }

}