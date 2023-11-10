package b.clean.code;

abstract class OffMarkerTradeValidator extends TradeValidator {

    abstract void showMessage();

    public boolean isValid() {
        //blabla logique métier
        showMessage();
        return true;
    }
}

class WindowsOffMarkerTradeValidator extends OffMarkerTradeValidator {

    void showMessage() {
        //blabla UI-specific code
    }
}

class TestingOffMarkerTradeValidator extends OffMarkerTradeValidator {

    void showMessage() {
        //Rien pour ne pas avoir à gérer cette partie
    }
}
