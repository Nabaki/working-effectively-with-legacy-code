package b.clean.code;


/**
 * Le code nouveau est testable indépendamment du code legacy.
 * Extraire des comportements de cette façon peut faire émerger de nouveaux comportements et structures dans le code : ici on cré une interface HtmlGenerator
 */
public class QuarterlyReportTableHeaderGenerator implements HtmlGenerator {

    @Override
    public String generate() {
        return "<tr><td>colonne1</td><td>colonne2</td</tr>";
    }
}

