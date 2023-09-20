package banking;
public class BankAccount {
    
    String accountType;
    double balance;
    Customer customer;

    public BankAccount(String accountType, Customer customer){
        this.accountType=accountType;
        this.customer=customer;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }

    /**
     * withDrow gives Exception while Amount is more than available balance.
     * @throws Exception that amount is more than balance.
     */
    public void withDrow(double amount) throws Exception{
        if(amount > this.balance){
            throw new Exception("Amount is greater that available balance ");
        }
        this.balance-=amount;
    }

    /**
     * @return accountType  balance 
     */
    public String getAccountInfo(){
        return this.accountType +" "+this.balance;
    }
    
    /**
     * @return customerName  customerAddress
     */
    public String getCusromerInfo(){
        return this.customer.getName()+" "+this.customer.getAddress();
    }
}
