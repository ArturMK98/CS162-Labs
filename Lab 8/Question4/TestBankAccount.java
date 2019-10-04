public class TestBankAccount {
    
    public static void main(String args[]) {
        
        BankAccount mary = new BankAccount("Mary Bloggs", 500);
        BankAccount joe = new BankAccount("Joe Spot", 1000);
        
        System.out.println("Balance is " + mary.getBalance());
        joe.print();
        
        joe.deposit(500);
        joe.print();
        
        mary.print();
        
        mary.withdrawal(600);
        mary.withdrawal(400);
        
        mary.setName("Mary Bloggs-Spot");
        mary.print();
    }
}