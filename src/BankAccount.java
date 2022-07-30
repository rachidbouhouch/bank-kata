import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
    private final Date creationDate;
    private double balance;
    private final ArrayList<Operation> operations = new ArrayList<Operation>();

    BankAccount(Date creationDate, double balance){
        this.creationDate = creationDate;
        this.balance = balance;
    }

    public Date getCreationDate(){
        return creationDate;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount) throws Exception {
        LocalDateTime now = LocalDateTime.now();
        if (this.balance > amount){
            this.balance -= amount;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            this.operations.add(new Operation(dtf.format(now), amount, this.balance, "withdraw"));
        }else {
            throw new Exception("Transaction with date : " + now);
        }

    }

    public void deposit(double amount){
        this.balance += amount;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.operations.add(new Operation(dtf.format(now), amount, this.balance, "deposit"));
    }

    public ArrayList<Operation> getOperations(){
        return this.operations;
    }

    @Override
    public String toString(){
        return "Creation Date : " + creationDate.toString() + "\n"+
                "Initial Balance : " + balance + "\n"+
                "Operations : " + getOperations();
    }
}
