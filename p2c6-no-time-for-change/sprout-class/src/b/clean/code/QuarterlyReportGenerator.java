package b.clean.code;

import javax.xml.transform.Result;
import java.time.LocalDate;
import java.util.Collection;

public class QuarterlyReportGenerator implements HtmlGenerator {

    private Database database;
    LocalDate beginDate, endDate;

    @Override
    public String generate() {
        Collection<Result> results = database.queryResults(beginDate, endDate);

        String pageText = """
                <html><head><title>
                Quaterly Report
                </title></head><body><table>""";

        pageText += new QuarterlyReportTableHeaderGenerator().generate();

        for (Result result : results) {
            pageText += generateHtmlBody(result);
        }

        return pageText;
    }

    private String generateHtmlBody(Result result) {
        //traitement
        return "";
    }
}
