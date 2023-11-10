package b.clean.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CleanCode {

    public List getKSRStreams(OurHttpFileCollection files) {
        List list = new ArrayList();
        for (String name : files.getNames()) {
            IHttpPostedFile file = files.get(name);
            if (file.getFileName().endsWith(".ksr") || file.getFileName().endsWith(".txt") && file.getContentLength() > MIN_LEN))
            {
                //blabla
            }
        }
        return list;
    }
}

interface NameObjectCollectionBase {
}

/**
 * We don't use anymore this class but we copy their behaviour in ours which can be subclassed
 */
final class HttpFileCollection implements NameObjectCollectionBase {
}

class OurHttpFileCollection implements NameObjectCollectionBase {
}

/**
 * Skin and wrap
 * We use interface to ensure the same methods and signatures
 */
interface IHttpPostedFile {
    String getFileName();

    int getContentLength();
}

/**
 * We wrap the HttpPostedFile and flat pass every information.
 */
class HttpPostedFileWrapper implements IHttpPostedFile {
    private final HttpPostedFile file;

    public HttpPostedFileWrapper(HttpPostedFile file) {
        this.file = file;
    }

    @Override
    public String getFileName() {
        return null;
    }

    @Override
    public int getContentLength() {
        return file.getContentLength();
    }
}

/**
 * In tests we can return whatever want to
 */
class FakeHttpPostedFile implements IHttpPostedFile {
    private int length;

    public FakeHttpPostedFile(int length, Stream stream, ...) {
        this.length = length;
        //blabla
    }

    @Override
    public String getFileName() {
        return null;
    }

    @Override
    public int getContentLength() {
        return length;
    }
}