package b.clean.code;

public class BankingServices {

    public static void updateAccountBalance(int userID, Money amout) {
        //blabla
    }

    public void updateBalance(int userID, Money amout) {
        updateAccountBalance(userID, amout);
    }

    //blabla
}

public class SomeClass {

    /**
     * Now you can stub BankingServices to change his behaviour
     */
    public void someMethod(BankingServices bankingServices) {
        //blabla
        service.updateAccountBalance(id, sum);
    }
}