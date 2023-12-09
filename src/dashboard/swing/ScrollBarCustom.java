package dashboard.swing;

import java.awt.*;
import javax.swing.JScrollBar;

import java.awt.geom.RoundRectangle2D;
public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5,5));
        setForeground(new Color(37, 52, 57));
        setUnitIncrement(15);
        setOpaque(false);
    }
}
