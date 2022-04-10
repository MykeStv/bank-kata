public class Printer {

    void printStatements(Account account) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %20s %10s %10s", "DATE", "CREDIT", "DEBIT", "BALANCE");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(Statement state: account.statements()) {
            System.out.format("%10s %20s %10s %10s",
                    state.date(), state.getDeposit(), state.getWithdraw(), state.balance());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
}
