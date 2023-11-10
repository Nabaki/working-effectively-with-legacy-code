package a.legacy.code;

import java.util.ArrayList;
import java.util.List;

public class LegacyCode {

    //FIXME HttpFileCollection et HttpPostedFile n'ont pas de constructeur public et ne peut pas être étendus
    public List getKSRStreams(HttpFileCollection files) {
        List list = new ArrayList();
        for (String name : files.getNames()) {
            HttpPostedFile file = files.get(name);
            if (file.getFileName().endsWith(".ksr") || file.getFileName().endsWith(".txt") && file.getContentLength() > MIN_LEN)){
                //blabla
            }
        }
        return list;
    }
}

final class HttpFileCollection implements NameObjectCollectionBase {
}

interface NameObjectCollectionBase {

}