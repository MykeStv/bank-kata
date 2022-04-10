import wrappers.Amount;
import wrappers.DateValue;

import java.time.LocalDate;

public class Statement {
    // ATTRIBUTES
    private DateValue date;
    private Amount deposit;
    private Amount withdraw;
    private Amount balance;

    // CONSTRUCTOR
    public Statement(DateValue date, Amount deposit, Amount withdraw, Amount balance) {
        this.date = date;
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.balance = balance;
    }

    //DEPOSIT
    public static Statement deposit(DateValue date, Amount deposit, Amount balance) {
        return new Statement(date, deposit, Amount.of(0), balance);
    }

    //WITHDRAW
    public static Statement withdraw(DateValue date, Amount withdraw, Amount balance) {
        return new Statement(date, Amount.of(0), withdraw, balance);
    }

    public DateValue date() {
        return date;
    }

    public int getDeposit() {
        return deposit.amount();
    }

    public int getWithdraw() {
        return withdraw.amount();
    }

    public int balance() {
        return balance.amount();
    }
}
