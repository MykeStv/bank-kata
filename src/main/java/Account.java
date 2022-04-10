import wrappers.Amount;
import wrappers.DateValue;

import java.util.List;

public class Account {

    //ATTRIBUTE
    private Amount balance;
    private List<Statement> statements;

    //CONSTRUCTOR
    public Account() {

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


}
