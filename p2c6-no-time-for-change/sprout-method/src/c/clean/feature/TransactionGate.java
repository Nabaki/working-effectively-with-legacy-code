package c.clean.feature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class TransactionGate {

    TransactionBundle transactionBundle;

    /**
     * La méthode isole l'évolution est peut être testée (package private) sans pour autant devoir tester le code legacy.
     */
    List uniqueEntries(List entries) {
        List result = new ArrayList();
        for (Iterator it = entries.iterator(); it.hasNext(); ) {
            Entry entry = (Entry) it.next();
            if (!transactionBundle.getListManager().hasEntry(entry)) {
                result.add(entry);
            }
        }
        return result;
    }

    public void postEntries(List entries) {
        List entriesToAdd = uniqueEntries(entries);
        for (Iterator it = entriesToAdd.iterator(); it.hasNext(); ) {
            Entry entry = (Entry) it.next();
            entry.postDate();
        }
        transactionBundle.getListManager().addAll(entriesToAdd);
    }

}

interface Entry {
    void postDate();
}

interface TransactionBundle {
    ListManager getListManager();
}

interface ListManager {
    boolean hasEntry(Entry entry);
    void addAll(List entries);
}
