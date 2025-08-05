class Bank {
    int balance;

    public Bank(int b) {
        this.balance = b;
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(int amount) {
        balance = balance - amount;
        System.out.println("Withdrawn: $" + amount);
    }

    public void showBalance() {
        System.out.println("Your Balance: $" + balance);
    }

    @Override
    public String toString() {
        return "I'm from toString";
    }
}

public class Oops {
    public static void main(String[] args) {
        Bank b = new Bank(2000);

        System.out.println(b);       
        b.showBalance();             

        b.deposit(5000);              
        b.showBalance();             

        b.withdraw(3000);            
        b.showBalance();            
    }
}
