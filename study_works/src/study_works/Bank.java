package study_works;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Customer> listOfCustomers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.listOfCustomers = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Customer> getListOfCustomers() {
        return this.listOfCustomers;
    }

    public void addCustomer(Customer newCustomer) {
        this.listOfCustomers.add(newCustomer);
    }

    public void printCustomers () {
        ArrayList<Customer> customersForPrint = getListOfCustomers();
        System.out.println(getBankName() + " customers: ");
        System.out.println();
        for (int i = 0; i < customersForPrint.size(); i++) {
            customersForPrint.get(i).printTransactions();
            System.out.println();
        }
    }


}
