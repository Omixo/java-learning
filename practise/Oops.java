class DemoBank {

    int balance;

    // Constructor
    public DemoBank(int b) {
        this.balance = b;
    }

    @Override
    public String toString() {
        return "I m from toString";
    }

    public void showBalance() {
        System.out.println("Available balance: " + this.balance);
    }

    public void deposit(int amt) {
        this.balance += amt;
    }

    public void withdraw(int amt) {
        this.balance -= amt;
    }
}

public class Oops {
    public static void main(String[] args) {
        DemoBank b = new DemoBank(2000);

        System.out.println(b);         // Calls toString() method
        b.showBalance();               // 2000
        b.deposit(500);               // Adds 500
        b.showBalance();               // 2500
        b.withdraw(200);              // Deducts 200
        b.showBalance();               // 2300
    }
}
