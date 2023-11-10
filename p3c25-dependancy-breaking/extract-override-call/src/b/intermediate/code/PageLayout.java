package b.intermediate.code;

import java.util.ArrayList;
import java.util.List;

public class PageLayout {
    private int id = 0;
    private List styles;
    private StyleTemplate template;
    //blabla

    protected void rebindStyles() {
        styles = formStyles(template, id);
        //blabla
    }

    /**
     * réimplémentée dans les tests pour débloquer la situation
     */
    protected List formStyles(StyleTemplate tempalte, int id) {
        return StyleMaster.formStyles(template, id);
    }
}


public class TestingPageLayout extends PageLayout {
    @Override
    protected List formStyles(StyleTemplate tempalte, int id) {
        return new ArrayList();
    }
}