package dashboard.table;

import java.awt.*;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class TableHeader extends JLabel{
    public TableHeader(String text){
        super(text);
        setOpaque(true);
        setBackground(new Color(234, 225, 210));
        setFont(new Font("sansserif", 1, 18));
        setForeground(new Color(37, 52, 57));
        setBorder(new EmptyBorder(10,5,10,5));
    }
    
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(37, 52, 57));
        g2.drawLine(0, getHeight() -1, getWidth(), getHeight() - 1);
        super.paintComponent(g);
    }
}
