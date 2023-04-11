package structural.facade;

public class FiveCoinDispenser implements MoneyDispenser {
    private long numberOfCoins;
    private double GRAM_PER_COINS = 9.5;
    private double VALUE_PER_COIN = 5;

    FiveCoinDispenser(long numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
    }

    private void weight(double count) {
       System.out.println("Weighing " + count + " gramms of coins and moving to dispenser slots");
    }

    private long dispense(long requestedCoins) {
        long dispendedCoins = 0;
        if (this.numberOfCoins < requestedCoins) {
            dispendedCoins = this.numberOfCoins; 
        } else {
            dispendedCoins = requestedCoins;
        }
        weight(GRAM_PER_COINS * dispendedCoins);
        return dispendedCoins;
    }

    @Override
    public double getCurrencyItem(long requestCoins) {
        final long dispensedCoins = dispense(requestCoins);
        final double value = dispensedCoins * VALUE_PER_COIN;
        System.out.println("Dispensed " + dispensedCoins + ", "+  VALUE_PER_COIN + " notes , for a value of "+ value);
        return value;
    }

    @Override
    public double getValuePerItem() {
       return VALUE_PER_COIN;
    }
}
