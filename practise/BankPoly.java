import java.util.Scanner;

public class BankPoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // HDFC BANK
        System.out.println("HDFC BANK");
        System.out.print("Enter initial balance for HDFC: ");
        double hdfcInitial = sc.nextDouble();
        HDFC obj1 = new HDFC(hdfcInitial);
        obj1.showBalance();

        System.out.print("Enter deposit amount for HDFC: ");
        double hdfcDeposit = sc.nextDouble();
        obj1.deposit(hdfcDeposit);
        obj1.showBalance();

        System.out.print("Enter withdraw amount for HDFC: ");
        double hdfcWithdraw = sc.nextDouble();
        obj1.withdraw(hdfcWithdraw);
        obj1.showBalance();

        // SBI BANK
        System.out.println("\nSBI BANK");
        System.out.print("Enter initial balance for SBI: ");
        double sbiInitial = sc.nextDouble();
        SBI obj2 = new SBI(sbiInitial);
        obj2.showBalance();

        System.out.print("Enter deposit amount for SBI: ");
        double sbiDeposit = sc.nextDouble();
        obj2.deposit(sbiDeposit);
        obj2.showBalance();

        System.out.print("Enter withdraw amount for SBI: ");
        double sbiWithdraw = sc.nextDouble();
        obj2.withdraw(sbiWithdraw);
        obj2.showBalance();

        sc.close();
    }
}

class RBI {
    protected double balance;

    public RBI(double amount) {
        this.balance = amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void showBalance() {
        System.out.println("Current Balance: " + this.balance);
    }
}

class SBI extends RBI {
    public SBI(double amount) {
        super(amount);
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount - 50; // ₹50 fee
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount + 100; // ₹100 charge
    }
}

class HDFC extends RBI {
    public HDFC(double amount) {
        super(amount);
    }
}
