package structural.facade;

public class BankCashMachine {
    private MoneyDispenser fiveCoinDispenser;
    private MoneyDispenser hundredsDispenser;
    private MoneyDispenser twentyDispenser;
    private MoneyDispenser fiftyDispenser;
 
    public BankCashMachine(long hundredNotes, long fiftyNotes , long twentyNotes, long fiveCoins) {
       fiveCoinDispenser = new FiveCoinDispenser(fiveCoins);
       hundredsDispenser = new HundredsDispenser(hundredNotes);
       fiftyDispenser = new FiftyDispenser(fiftyNotes);
       twentyDispenser = new TwentyDispenser(twentyNotes);
    }
 
    private double getHundersNotes(double count) {
        return hundredsDispenser.getCurrencyItem((long)count);
    }

    private double getFiftyNotes(double count) {
        return fiftyDispenser.getCurrencyItem((long)count);
    }

    private double getFiveCoins(double count) {
        return fiveCoinDispenser.getCurrencyItem((long)count);
    }
    private double getTwentyNotes(double count) {
        return twentyDispenser.getCurrencyItem((long)count);
    }

    public boolean getAmount(double requestedAmount){
        if (requestedAmount % 5 != 0) {
            System.out.println("Requested amount must be a multiple of 5");
            return false;
        }
        System.out.println("*************************************************");
        System.out.println(String.format( "*              Requested %.2f count           *", requestedAmount));
        System.out.println("*************************************************");
        double amountToDispense = requestedAmount;
        amountToDispense = amountToDispense  -  getHundersNotes(Math.floor(amountToDispense/hundredsDispenser.getValuePerItem()));
        amountToDispense = amountToDispense  -  getFiftyNotes(Math.floor(amountToDispense/fiftyDispenser.getValuePerItem()));
        amountToDispense = amountToDispense  -  getTwentyNotes(Math.floor(amountToDispense/twentyDispenser.getValuePerItem()));
        amountToDispense = amountToDispense  -  getFiveCoins(Math.floor(amountToDispense/fiveCoinDispenser.getValuePerItem()));
     

        if(amountToDispense==requestedAmount) {
            System.out.println("Technical error, failed to dispense requested a");
            return true;
        }
        System.out.println("Dispensed total amount of " + requestedAmount + "\n");
        return false;

    }
   
 }