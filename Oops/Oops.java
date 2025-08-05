class Bank
  {

int balance;
public Bank(int b){
    this.balance = b;
}

@Override
    public String toString(){
        return("i m from toString");
    }


    public void showBalance (){
    System.out.println("your Balance :100$k"+" "+  this.balance);
}
}
    



public class Oops {
public static void main(String[] args) {
    Bank b = new Bank(2000);
    System.out.println(b);
    b.showBalance();
}    
}
