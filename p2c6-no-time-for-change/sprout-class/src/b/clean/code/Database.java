package b.clean.code;

import javax.xml.transform.Result;
import java.time.LocalDate;
import java.util.Collection;

public interface Database {
    Collection<Result> queryResults(LocalDate beginDate, LocalDate endDate);
}
