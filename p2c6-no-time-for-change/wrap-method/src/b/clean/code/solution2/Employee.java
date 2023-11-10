package b.clean.code.solution2;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Iterator;

public class Employee {

    Collection<Timecard> timecards;
    private int payRate;
    private PayPeriod payPeriod;
    private PayDispatcher payDispatcher;
    private LocalDateTime date;
    private int amount;

    /**
     * La méthode de base est renommée pour expliciter l'ajout de comportement.
     * Toutes les endroits dans le code où la méthode est utilisée seront impacté par la feature
     */
    public void makeLoggedPayment() {
        logPayment();
        dispatchPayment();
    }

    public void dispatchPayment() {
        Money amout = new Money();
        for (Iterator it = timecards.iterator(); it.hasNext(); ) {
            Timecard card = (Timecard) it.next();
            if (payPeriod.contains(card)) {
                amout.add(card.getHours() * payRate);
            }
        }
        payDispatcher.pay(this, date, amount);
    }

    private void logPayment() {
        //sout "Paiement en cours"
    }
}

class Money {
    void add(int value) {
        //Fait qqch
    }
}

interface Timecard {
    int getHours();
}

interface PayPeriod {
    boolean contains(Timecard card);
}

interface PayDispatcher {
    void pay(Employee employee, LocalDateTime date, int amount);
}