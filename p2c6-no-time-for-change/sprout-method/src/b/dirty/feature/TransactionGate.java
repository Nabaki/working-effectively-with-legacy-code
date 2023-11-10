package b.dirty.feature;

import java.util.*;

class TransactionGate {

    TransactionBundle transactionBundle;

    public void postEntries(List entries) {
        List entriesToAdd = new ArrayList();
        for (Iterator it = entries.iterator(); it.hasNext(); ) {
            Entry entry = (Entry) it.next();
            /**
             * Ajout de code intrusif, complexifiant le code et impossible à tester sans tester la méthode entière
             */
            if (!transactionBundle.getListManager().hasEntry(entry)) {
                entry.postDate();
                entriesToAdd.add(entry);
            }
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
    boolean hasEntry(Entry entry);
    void addAll(List entries);
}
