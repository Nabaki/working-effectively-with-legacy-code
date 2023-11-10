package a.legacy.code;

import java.util.List;

public class PageLayout {
    private int id = 0;
    private List styles;
    private StyleTemplate template;
    //blabla

    //FIXME StyleMaster.formStyles(..) est une dépendance qui qui empèche de tester la classe
    protected void rebindStyles() {
        styles = StyleMaster.formStyles(template, id);
        //blabla
    }
}
