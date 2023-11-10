package a.legacy.code;

import b.clean.code.Database;

import javax.xml.transform.Result;
import java.time.LocalDate;
import java.util.Collection;

public class QuarterlyReportGenerator {

    private Database database;
    private LocalDate beginDate, endDate;

    //TODO On veut ajouter du code html supplémentaire à la ligne 20
    public String generate() {
        Collection<Result> results = database.queryResults(beginDate, endDate);

        String pageText = """
                <html><head><title>
                Quaterly Report
                </title></head><body><table>""";

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