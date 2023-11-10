package a.legacy.code;

import java.awt.*;

public class WaterColorPane {

    public WaterColorPane(Form border, WashBrush brush, Pattern backdrop) {
        //blabla
        anteriorPanel = new Panel(border);
        anteriorPanel.setBorderColor(brush.getForColor());
        backgroundPanel = new Panel(border, backdrop);

        cursor = new FocusWidget(brush, backgroundPanel);
        //blabla
    }

    //blabla
}


