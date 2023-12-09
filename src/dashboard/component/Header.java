package dashboard.component;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Header extends javax.swing.JPanel {

    private int x, y;
    public Header() {
        initComponents();
        setOpaque(false);
    }
    
    public void addEvent(ActionListener ev){
        menuButton.addActionListener(ev);
    }
    
    public void moveFrame(JFrame f){
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
                f.setLocation(f.getX() + me.getX() - x, f.getY() + me.getY() - y);
            }
        });
    }
    
    public void minFrame(JFrame f){
        minimizeButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setState(JFrame.ICONIFIED);
            }
            
        });
    }
    
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, getHeight() - 20, getWidth(),  getHeight());
        super.paintComponent(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movePanel = new javax.swing.JPanel();
        menuButton = new dashboard.swing.Button();
        exitButton = new dashboard.swing.Button();
        minimizeButton = new dashboard.swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        movePanel.setBackground(new java.awt.Color(255, 255, 255));
        movePanel.setOpaque(false);

        javax.swing.GroupLayout movePanelLayout = new javax.swing.GroupLayout(movePanel);
        movePanel.setLayout(movePanelLayout);
        movePanelLayout.setHorizontalGroup(
            movePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );
        movePanelLayout.setVerticalGroup(
            movePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu.png"))); // NOI18N

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        minimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimize.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(movePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(minimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(movePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addComponent(minimizeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dashboard.swing.Button exitButton;
    public dashboard.swing.Button menuButton;
    private dashboard.swing.Button minimizeButton;
    private javax.swing.JPanel movePanel;
    // End of variables declaration//GEN-END:variables
}
