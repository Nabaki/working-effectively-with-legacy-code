package a.legacy.code;

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

    //TODO On veut ajouter un log lorsque le paiement a lieu
    public void pay() {
        Money amout = new Money();
        for (Iterator it = timecards.iterator(); it.hasNext(); ) {
            Timecard card = (Timecard) it.next();
            if (payPeriod.contains(card)) {
                amout.add(card.getHours() * payRate);
            }
        }
        payDispatcher.pay(this, date, amount);
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