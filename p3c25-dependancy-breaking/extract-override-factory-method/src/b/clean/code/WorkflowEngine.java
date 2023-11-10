package b.clean.code;

public class WorkflowEngine {

    public WorkflowEngine(){
        this.tm = makeTransactionManager();
        //blabla
    }

    /**
     * on peut désormais override cette métode dans un test
     */
    protected Transactionmanager makeTransactionManager() {
        Reader reader = new ModelReader(AppConfig.getDryConfiguration());
        Persister persister = new XMLStore(AppConfig.getDryConfiguration());
        return new Transactionmanager(reader, persister);
    }

    //blabla
}

public class TestWorkflowEngine extends WorkflowEngine {
    @Override
    protected Transactionmanager makeTransactionManager() {
        return new FakeTransactionmanager();
    }
}