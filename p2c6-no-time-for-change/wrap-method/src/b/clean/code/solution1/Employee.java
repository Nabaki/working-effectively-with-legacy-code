package b.clean.code.solution1;

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
     * On renomme la méthode et on cré une nouvelle méthode wrap qui sera utilisée là où le log est nécessaire
     * le log peut être testé indépendamment de la méthode legacy
     */
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

    public void pay() {
        logPayment();
        dispatchPayment();
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