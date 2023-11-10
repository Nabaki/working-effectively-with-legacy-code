package simplecase.b.clean.code;

public class MessageRouter {

    void route(Mesage message) {
        Dispatcher dispatcher = ExternalRouter.getInstance().getDispatcher();
        if (dispatcher != null) {
            dispatcher.sendMessage(message);
        }
    }
}

class ExternalRouter {

    private static ExternalRouter instance;

    private ExternalRouter() {
    }

    public static ExternalRouter getInstance() {
        if (instance == null) {
            instance = new ExternalRouter();
        }

        return instance;
    }

    //create a setter to change the instance during tests
    static void setInstance(ExternalRouter newInstance) {
        instance = newInstance;
    }

    public Dispatcher getDispatcher() {
        //blabla
    }
}

class TestingExternalRouter extends ExternalRouter {

}