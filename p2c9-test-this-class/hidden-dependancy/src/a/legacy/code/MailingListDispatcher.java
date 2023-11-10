package a.legacy.code;

public class MailingListDispatcher {

    public MailingListDispatcher() {
        //FIXME bug lors des tests car configuration complexe
        new MailProcessor().connect();
    }
}

class MailProcessor {

    public void connect() {
        //blabla
    }
}
