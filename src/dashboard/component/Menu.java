package dashboard.component;

import dashboard.event.*;
import dashboard.model.menuModel;
import dashboard.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;

public class Menu extends javax.swing.JPanel {

    public boolean isEnableMenu() {
        return enableMenu;
    }
    
    public boolean isShowMenu() {
        return showMenu;
    }
 
    public void setEvent(MenuSelection event) {
        this.event = event;
    }

    public void setEnableMenu(boolean enableMenu) {
        this.enableMenu = enableMenu;
    }

    public void setShowMenu(boolean showMenu) {
        this.showMenu = showMenu;
    }
    public MenuItems m;
    private final MigLayout layout;
    private MenuSelection event;
    private boolean enableMenu = true;
    private boolean showMenu = true;
    
    public Menu() {
        initComponents();
        setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setVerticalScrollBar(new ScrollBarCustom());
        layout = new MigLayout("wrap, fillx, insets 10 0 10 0,", "[fill]", "[]0[]");
        panel.setLayout(layout);
    }
    
    public void initMenu(){
        addMenu(new menuModel(new ImageIcon(getClass().getResource("/icons/home.png")), "Home"));
        addMenu(new menuModel(new ImageIcon(getClass().getResource("/icons/student.png")), "Students", "BSIT"));
        addMenu(new menuModel(new ImageIcon(getClass().getResource("/icons/calendar.png")), "Calender", "2023"));
    }
    
    private void addMenu(menuModel menu){
        m = new MenuItems(menu, getEventMenu(), event, panel.getComponentCount());
        panel.add(m, "h 40!");
    }
    
    private MenuEvent getEventMenu(){
        return new MenuEvent(){
            @Override
            public boolean menuPressed(Component comp, boolean open) {
                if(isEnableMenu()){
                    if(isShowMenu()){
                        if(open){
                        new AnimateMenu(layout, comp).openMenu();
                        } else{
                        new AnimateMenu(layout, comp).closeMenu();
                        }
                        return true;
                    }
                }
                return false;
            }
        };
    }
    
    public void hideSubMenu(){
        for (Component comp : panel.getComponents()){
            MenuItems item = (MenuItems)comp;
            if(item.isOpen()){
                new AnimateMenu(layout, comp, 500).closeMenu();
                item.setOpen(false);
                item.setFg(new Color(234, 225, 210));
            }
        }
    }
    
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(37, 52, 57));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth()-20, 0, getWidth(),  getHeight());
        super.paintComponent(grphcs);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        profile1 = new dashboard.component.Profile();

        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.setOpaque(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 916, Short.MAX_VALUE)
        );

        scrollPane.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(profile1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    private dashboard.component.Profile profile1;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
