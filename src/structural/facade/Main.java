package structural.facade;

public class Main {
    
    public static void main(String[] args) {
		
        var atm = new BankCashMachine(1000, 5000, 10000, 20000);

        atm.getAmount(255);
        
        atm.getAmount(365);

        atm.getAmount(1885);
	}
}
