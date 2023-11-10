package b.intermediate.code;

import java.awt.*;
import java.util.Iterator;
import java.util.Vector;

public class GDIBrush implements PointRenderer {

    public void draw(Vector<Point> renderingRoots, ColorMatrix colors, Vector<Point> selection) {
        Renderer renderer = new Renderer(this, renderingRoots, colors, selection);
        renderer.draw();
    }

    @Override
    public void drawPoint(int x, int y, COLOR color) {
        //blabla
    }
}

class Renderer {

    private final PointRenderer renderer;
    private final Vector<Point> renderingRoots;
    private final ColorMatrix colors;
    private final Vector<Point> selection;

    Renderer(PointRenderer renderer, Vector<Point> renderingRoots, ColorMatrix colors, Vector<Point> selection) {
        this.renderer = renderer;
        this.renderingRoots = renderingRoots;
        this.colors = colors;
        this.selection = selection;
    }

    void draw() {
        for (Iterator it = renderingRoots.iterator(); it.hasNext(); ) {
            Point point = (Point) it.next();
            //blabla
            renderer.drawPoint(point.x, point.y, colors[n]);
        }
    }
}

/**
 * drawPoint peut désormais être mocké ou testé indépendamment du reste
 */
interface PointRenderer {
    void drawPoint(int x, int y, COLOR color);
}