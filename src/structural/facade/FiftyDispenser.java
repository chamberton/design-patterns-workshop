package structural.facade;

public class FiftyDispenser implements MoneyDispenser {
    private long numberOfNotes;
    final static private double VALUE_PER_NOTE = 50;

    FiftyDispenser(long numberOfNotes) {
        this.numberOfNotes = numberOfNotes;
    }

    private long dispense(long count) {
        long dispensedNotes = 0;
        if (this.numberOfNotes < count) {
            dispensedNotes = this.numberOfNotes;
           } else {
            dispensedNotes = count;
           }
       return dispensedNotes;
    }

    @Override
    public double getCurrencyItem(long requestedNotes) {
       final long dispensedNotes = dispense(requestedNotes);
       final double value = dispensedNotes * VALUE_PER_NOTE;
       System.out.println("Dispensed " + dispensedNotes + ", "+  VALUE_PER_NOTE+ " notes , for a value of "+ value);
       return value;
    }

    @Override
    public double getValuePerItem() {
       return VALUE_PER_NOTE;
    }

}
