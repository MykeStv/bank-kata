import wrappers.Amount;
import wrappers.DateValue;

import java.time.LocalDate;

public class StartApp {

    public static void main(String[] args) {

        Account account = new Account();

        account.deposit(Amount.of(1000), DateValue.of("2022-04-08"));
        account.deposit(Amount.of(2000), DateValue.of("2022-04-09"));
        account.withdraw(Amount.of(500), DateValue.of("2022-04-10"));

        System.out.println(account);

    }
}
