package a.legacy.code;

public class RegisterSale {

    //FIXME we want to test it with total control on inventory
    public void addItem(Barcode code) {
        Item newItem = Inventory.getInventory().itemForBarCde(code);
        items.add(newItem);
    }
}
