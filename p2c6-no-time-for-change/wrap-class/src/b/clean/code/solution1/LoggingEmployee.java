package b.clean.code.solution1;

/**
 * Pattern decorator
 */
public class LoggingEmployee extends Employee {

    public void pay() {
        logPayment();
        super.pay();
    }

    private void logPayment() {
        //sout "Paiement en cours"
    }
}
