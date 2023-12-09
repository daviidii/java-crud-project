package dashboard.swing;

import dashboard.component.*;
import dashboard.swing.*;
import dashboard.event.*;
import dashboard.model.menuModel;
import java.awt.*;
import java.awt.event.*;
import net.miginfocom.swing.MigLayout;

public class MenuItems extends javax.swing.JPanel {

    public menuModel getMenu() {
        return menu;
    }

    public void setA(float a) {
        this.a = a;
    }

    public boolean isOpen() {
        return open;
    }
    public void setOpen(boolean open) {
        this.open = open;
    }

    public MenuSelection getSelected() {
        return selected;
    }
    public void setSelected(MenuSelection selected) {
        this.selected = selected;
    }

    public int getI() {
        return i;
    }
    
    public void setFg(Color color){
        first.setForeground(color);
    }
    
    private MenuButton first;
    private float a;
    private menuModel menu;
    private boolean open;
    private MenuSelection selected;
    private int i;
    
    public MenuItems(menuModel menu, MenuEvent ev, MenuSelection selected, int i) {
        initComponents();
        this.menu = menu;
        this.selected = selected;
        this.i = i;
        setOpaque(false);
        setLayout(new MigLayout("wrap, fillx, insets 0 0 0 0", "[fill]", "[fill, 40!]0[fill, 35!]"));
        first = new MenuButton(menu.getIcon(),"     "+menu.getMainMenu());
        first.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(menu.getSubMenu().length > 0){
                    if(ev.menuPressed(MenuItems.this, !open)){
                        first.setForeground(new Color(37, 52, 57));
                        open = !open;
                    }
                    if(!open){
                        first.setForeground(new Color(234, 225, 210));
                    }
                }
                selected.selectedMenu(i, -1);
            }
        });
        add(first);
        int subMenuIndex = -1;
        for (String st : menu.getSubMenu()){
            MenuButton item = new MenuButton(st);
            item.setForeground(new Color(37, 52, 57));
            item.setIndex(++subMenuIndex);
            item.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    selected.selectedMenu(i, item.getIndex());
                }
            });
            add(item);
        }
    }
    
    protected void paintComponent(Graphics grphcs){
        int h = getPreferredSize().height;
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(234, 225, 210));
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, a));
        g2.fillRect(0, 2, getWidth(), 40);
        g2.setComposite(AlphaComposite.SrcOver);
        g2.fillRect(0, 40, getWidth(), h - 40);
        g2.setColor(new Color(37, 52, 57));
        g2.drawLine(30, 40, 30, h - 17);
        
        if(menu.getSubMenu().length > 0){
            createArrow(g2);
        }
        
        super.paintComponent(grphcs);
    }
    
    private void createArrow(Graphics2D g2){
        int size = 4;
        int y = 19;
        int x = 205;
        g2.setColor(new Color(234, 225, 210));
        float ay = a * size;
        float ay1 = (1f - a) * size;
        g2.drawLine(x, (int)(y + ay), x + 4, (int) (y + ay1));
        g2.drawLine(x+4, (int)(y + ay1), x + 8, (int)(y + ay));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
