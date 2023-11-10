package a.legacy.code;

import java.awt.*;
import java.util.Iterator;
import java.util.Vector;

public class GDIBrush {

    //FIXME long method hard to test, we have to split it
    public void draw(Vector<Point> renderingRoots, ColorMatrix colors, Vector<Point> selection) {
        for (Iterator it = renderingRoots.iterator(); it.hasNext(); ) {
            Point point = (Point) it.next();
            //blabla
            drawPoint(point.x, point.y, colors[n]);
        }
    }

    private void drawPoint(int x, int y, COLOR color) {
        //blabla
    }
}
