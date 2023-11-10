package simplecase.a.legacy.code;

public class MessageRouter {

    void route(Mesage message) {
        Dispatcher dispatcher = ExternalRouter.getInstance().getDispatcher();
        if (dispatcher != null) {
            dispatcher.sendMessage(message);
        }
    }
}

final class ExternalRouter {

    private static ExternalRouter instance;

    private ExternalRouter() {
    }

    public static ExternalRouter getInstance() {
        if (instance == null) {
            instance = new ExternalRouter();
        }

        return instance;
    }
}