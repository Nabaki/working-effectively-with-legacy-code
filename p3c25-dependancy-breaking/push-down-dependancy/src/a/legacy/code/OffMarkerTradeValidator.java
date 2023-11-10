package a.legacy.code;

public class OffMarkerTradeValidator extends TradeValidator {

    private void showMessage() {
        //blabla UI-specific code
    }

    //FIXME On veut pouvoir tester cette méthode sans s'occuper de showMessage
    public boolean isValid() {
        //blabla logique métier
        showMessage();
        return true;
    }
}
