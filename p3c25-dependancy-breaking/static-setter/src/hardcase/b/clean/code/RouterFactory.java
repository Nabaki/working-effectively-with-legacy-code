package hardcase.b.clean.code;

interface RouterServer {
    Router makeRouter();
}

public class RouterFactory {

    static RouterServer server = new RouterServer() {
        @Override
        public Router makeRouter() {
            return new EWNRouter();
        }
    }

    static Router makeRouter() {
        return server.makeRouter();
    }

    static void setServer(RouterServer server) {
        RouterFactory.server = server;
    }
}

class TestingTrucTruc {

    protected void setUp() {
        RouterServer.setServer(new RouterServer() {
            @Override
            public Router makeRouter() {
                return new FakeRouter();
            }
        });
    }
}