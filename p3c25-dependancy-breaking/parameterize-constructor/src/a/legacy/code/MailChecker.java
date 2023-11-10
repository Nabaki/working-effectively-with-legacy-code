package a.legacy.code;

public class MailChecker {
    private final MailReceiver receiver;
    private final int checkPeriodSeconds;

    //FIXME Difficile de tester car on ne peut pas mocker le receiver
    public MailChecker(int checkPeriodSeconds) {
        this.receiver = new MailReceiver();
        this.checkPeriodSeconds = checkPeriodSeconds;
    }
}
