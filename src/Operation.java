import java.util.Date;

public class Operation {

    private String date;
    private double amount;
    private double balance;
    private String operation;

    public Operation(String operationDate, double amount, double balance, String operation) {
        this.date = operationDate;
        this.amount = amount;
        this.balance = balance;
        this.operation = operation;
    }

    public String getDate(){
        return date;
    }

    public double getAmount(){
        return amount;
    }

    public double getBalance(){
        return balance;
    }

    public String getOperation(){
        return operation;
    }

    @Override
    public String toString(){
        return "Date : " + date + "\n"+
                "Amount : " + amount + "\n"+
                "Balance : " + balance + "\n" +
                "Operation : " + operation + "\n"+
                "=========================================================" + "\n";
    }

}
