package main.components;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
public class ImagePanel extends javax.swing.JPanel {
    
    private final ImageIcon icon = new ImageIcon(getClass().getResource("/icons/gridMinimal_600x888.png"));
    public ImagePanel() {
        initComponents();
        setOpaque(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movePanel = new javax.swing.JPanel();

        movePanel.setOpaque(false);

        javax.swing.GroupLayout movePanelLayout = new javax.swing.GroupLayout(movePanel);
        movePanel.setLayout(movePanelLayout);
        movePanelLayout.setHorizontalGroup(
            movePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        movePanelLayout.setVerticalGroup(
            movePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(movePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(movePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 800, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Shape shape = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setClip(shape);
        g2.fill(shape);
        g2.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), null);
    }
    int x, y;
    public void initMove(JFrame jf){
        movePanel.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me){
                x = me.getX();
                y = me.getY();
            }
            public void mouseEntered(MouseEvent me){
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent me){
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
        movePanel.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent me){
                jf.setLocation(me.getXOnScreen() - x,me.getYOnScreen() - y);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel movePanel;
    // End of variables declaration//GEN-END:variables
}
