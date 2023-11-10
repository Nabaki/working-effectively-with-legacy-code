package a.legacy.code;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TransactionGate {

    private TransactionBundle transactionBundle;

    public void postEntries(List entries) {
        for (Iterator it = entries.iterator(); it.hasNext();) {
            Entry entry = (Entry) it.next();
            entry.postDate();
        }
        transactionBundle.getListManager().addAll(entries);
    }
}

interface Entry {
    void postDate();
}

interface TransactionBundle {
    ListManager getListManager();
}

interface ListManager {
    void addAll(List entries);
}