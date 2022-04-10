import wrappers.Amount;
import wrappers.DateValue;

import java.util.ArrayList;
import java.util.List;

public class Account {

    //ATTRIBUTE
    private Amount balance;
    private List<Statement> statements;

    //CONSTRUCTOR
    public Account() {
        this.balance = Amount.of(0);
        this.statements = new ArrayList<>();
    }


    //METHODS
    void deposit(Amount value, DateValue date) {
        this.balance = Amount.of(this.balance.sum(value));
        Statement state = Statement.deposit(date, value, this.balance);
        statements.add(state);
    }

    void withdraw(Amount value, DateValue date){
        this.balance = Amount.of(this.balance.substract(value));
        Statement state = Statement.withdraw(date, value, this.balance);
        statements.add(state);
    }

    void printStatements() {

    }

    public List<Statement> statements() {
        return statements;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", statements=" + statements +
                '}';
    }
}
