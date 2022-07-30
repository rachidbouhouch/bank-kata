import java.time.LocalDateTime;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        BankAccount b1 = new BankAccount(date, 15000);
        BankAccount b2 = new BankAccount(date, 50000);
        BankAccount b3 = new BankAccount(date, 20000);

        b1.deposit(5000);

        b2.withdraw(1000);

        b3.deposit(3000);
        b3.deposit(1000);
        b3.withdraw(2000);

        System.out.println(b3.getOperations());;

    }
}
