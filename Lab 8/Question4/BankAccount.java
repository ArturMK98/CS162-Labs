public class BankAccount {
    
    private String name;
    private double balance;
    private int accountID;
    
    private static int counter = 100001;
    
    public BankAccount(String name, double balance) {
        
        this.name = name;
        this.balance = balance;
        accountID = counter++;
    }
    
    public String getName() {
        
        return name;
    }
    
    public double getBalance() {
        
        return balance;
    }
    
    public int getAccountID() {
        
        return accountID;
    }
    
    public void setName(String name) {
        
        this.name = name;
    }
    
    public void setBalance(double balance) {
        
        this.balance = balance;
    }
    
    public void deposit(double deposit) {
        
        setBalance(balance += deposit);
    }
    
    public void withdrawal(double withdraw) {
        
        if(withdraw > balance) {
            
            System.out.println("Insufficient funds");
            
        } else {
            
            setBalance(balance -= withdraw);
        }
    }
    
    public void print() {
        
        System.out.println("******************");
        System.out.println("Name: " + name);
        System.out.println("Balance " + balance);
        System.out.println("Account ID: " + accountID);
        System.out.println("******************");
    }
}