package wrappers;

public class Amount {
    private int amount;

    public Amount(int amount) {
        this.amount = amount;
    }

    //Why this has to be static?
    public static Amount of(int amount){
        return new Amount(amount);
    }

    public int sum(Amount deposit) {
        var value = this.amount + deposit.amount();
        return value;
    }

    public int substract(Amount withdraw) {
        if (withdraw.amount > this.amount) {
            throw new IllegalArgumentException("Cann't withdraw more that are in balance");
        }
        var value = this.amount - withdraw.amount();
        return value;
    }

    public int amount() {
        return amount;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "Amount{" +
                "amount=" + amount +
                '}';
    }
}
