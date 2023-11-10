package b.clean.code;

public class MailChecker {
    private final MailReceiver receiver;
    private final int checkPeriodSeconds;

    /**
     * Si ce constructeur était supprimé, il faudrait impacter tout le projet avec le nouveau constructeur
     */
    public MailChecker(int checkPeriodSeconds) {
        this(new MailReceiver(), checkPeriodSeconds);
    }

    /**
     * Ce constructeur peut être utilisé pour les tests
     */
    public MailChecker(MailReceiver receiver, int checkPeriodSeconds) {
        this.receiver = receiver;
        this.checkPeriodSeconds = checkPeriodSeconds;
    }
}
