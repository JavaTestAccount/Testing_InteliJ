package study_works;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Integer> customerTransactions;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.customerTransactions = new ArrayList<>();
    }

    public ArrayList<Integer> getCustomerTransactions() {
        return customerTransactions;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addTransaction(int amount) {
        this.customerTransactions.add(amount);
    }

    public void printTransactions() {

        ArrayList<Integer> printCustomers = getCustomerTransactions();
        System.out.println("Transactions for " + getCustomerName());
        for (int i = 0; i < printCustomers.size(); i++) {
            System.out.println("Transaction №" + (i + 1) + " " + printCustomers.get(i) + "$");
        }
    }
}
