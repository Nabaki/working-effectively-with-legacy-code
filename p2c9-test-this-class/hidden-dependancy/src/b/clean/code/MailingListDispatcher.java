package b.clean.code;

public class MailingListDispatcher {

    /**
     * Parameterize constructor permet d'instancier MailProcessor à l'extérieur, on peut extraire une interface pour créer un FakeMailProcessor
     */
    public MailingListDispatcher(MailProcessor mailProcessor) {
        mailProcessor.connect();
    }
}

class MailProcessor {

    public void connect() {
        //blabla
    }
}
