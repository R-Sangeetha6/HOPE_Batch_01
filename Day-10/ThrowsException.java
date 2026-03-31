//class InsufficientBalanceException extends Exception{
   // public InsufficientBalanceException(String message){
      //  super(message);
   // }
//}
class Bank{
   private double balance;
    
    void Deposite(double amount)throws InsufficientBalanceException{
        if(amount>0){
       balance+=amount;
    }
    else if(amount==0){
        throw new InsufficientBalanceException("Amount cannot be zero or negative");
    }

    }
    void Withdraw(double amount)throws InsufficientBalanceException{
      if(balance<amount){
        throw new InsufficientBalanceException("Insufficient balance");
      }else{
        balance-=amount;
        System.out.println("Withdrawn amount:"+amount);
      }

    }
    void checkBalance(){
        System.out.println("Balance:"+balance);
    }

}


public  class ThrowsException{
    public static void main(String[] args) {
        Bank bank=new Bank();
        try {
            bank.Deposite(100);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            bank.Withdraw(300);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e);
        }
        
        bank.checkBalance();

        
    }}

