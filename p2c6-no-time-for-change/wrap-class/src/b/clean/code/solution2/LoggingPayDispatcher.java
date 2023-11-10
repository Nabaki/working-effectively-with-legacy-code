package b.clean.code.solution2;

/**
 * Wrapper qui ajoute un comportement à Employee
 * Contrairement à la solution 1, on perd l'héritage des autres méthodes de Employee
 */
public class LoggingPayDispatcher {

    private final Employee employee;

    public LoggingPayDispatcher(Employee employee) {
        this.employee = employee;
    }

    public void pay() {
        logPayment();
        employee.pay();
    }

    private void logPayment() {
        //sout "Paiement en cours"
    }
}
