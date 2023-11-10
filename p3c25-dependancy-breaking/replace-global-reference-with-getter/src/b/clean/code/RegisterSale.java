package b.clean.code;

public class RegisterSale {

    public void addItem(Barcode code) {
        Item newItem = getInventory().itemForBarCde(code);
        items.add(newItem);
    }

    Inventory getInventory() {
        return Inventory.getInventory();
    }
}

class FakeInventory extends Inventory {
    //blabla
}

class TestingRegisterSale extends RegisterSale {
    Inventory inventory = new FakeInventory();

    Inventory getInventory() {
        return inventory;
    }
}