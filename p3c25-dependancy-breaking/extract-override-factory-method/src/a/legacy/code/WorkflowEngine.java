package a.legacy.code;

public class WorkflowEngine {

    //FIXME impossible d'instancier toutes ces classes dans des tests, on veut juste mocker Transactionmanager
    public WorkflowEngine() {
        Reader reader = new ModelReader(AppConfig.getDryConfiguration());
        Persister persister = new XMLStore(AppConfig.getDryConfiguration());
        this.tm = new Transactionmanager(reader, persister);
        //blabla
    }

    //blabla
}
