package main.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicPasswordFieldUI;
import util.RenderShadow;

public class PasswordField extends JPasswordField {

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        createImageShadow();
        repaint();
    }

    public Color getShadowColor() {
        return shadowColor;
    }

    public void setShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
        createImageShadow();
        repaint();
    }

    private int round = 10;
    private Color shadowColor = new Color(170, 170, 170);
    private BufferedImage imageShadow;
    private final Insets shadowSize = new Insets(2, 5, 8, 5);

    public PasswordField() {
        setUI(new TextUI());
        setOpaque(false);
        setForeground(new Color(178,158,132));
        setSelectedTextColor(new Color(255, 255, 255));
        setSelectionColor(new Color(150,150,150));
        setBorder(new EmptyBorder(10, 12, 15, 12));
        setBackground(new Color(255, 255, 255));
        addPlaceHolder(PasswordField.this);
        
        addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent ev){
                if(PasswordField.this.getText().equals("Password")){
                    PasswordField.this.setText(null);
                    PasswordField.this.requestFocus();
                    PasswordField.this.setEchoChar('*');
                    removePlaceHolder(PasswordField.this);
                }
            }
            @Override
            public void focusLost(FocusEvent ev){
                if (PasswordField.this.getText().length() == 0){
                    addPlaceHolder(PasswordField.this);
                    PasswordField.this.setText("Password");
                    PasswordField.this.setEchoChar('\u0000');
                }
            }
        });
    }
    public void addPlaceHolder(JPasswordField pf){
        Font font = pf.getFont();
        font = font.deriveFont(Font.PLAIN);
        pf.setFont(font);
        pf.setForeground(new Color(222,207,186));
    }
    
    public void removePlaceHolder(JPasswordField pf){
        Font font = pf.getFont();
        font = font.deriveFont(Font.PLAIN);
        pf.setFont(font);
        pf.setForeground(new Color(178,158,132));
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        double width = getWidth() - (shadowSize.left + shadowSize.right);
        double height = getHeight() - (shadowSize.top + shadowSize.bottom);
        double x = shadowSize.left;
        double y = shadowSize.top;
        //  Create Shadow Image
        g2.drawImage(imageShadow, 0, 0, null);
        //  Create Background Color
        g2.setColor(getBackground());
        Area area = new Area(new RoundRectangle2D.Double(x, y, width, height, round, round));
        g2.fill(area);
        g2.dispose();
        super.paintComponent(grphcs);
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        createImageShadow();
    }

    private void createImageShadow() {
        int height = getHeight();
        int width = getWidth();
        if (width > 0 && height > 0) {
            imageShadow = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = imageShadow.createGraphics();
            g2.drawImage(createShadow(), 0, 0, null);
            g2.dispose();
        }
    }

    private BufferedImage createShadow() {
        int width = getWidth() - (shadowSize.left + shadowSize.right);
        int height = getHeight() - (shadowSize.top + shadowSize.bottom);
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fill(new RoundRectangle2D.Double(0, 0, width, height, round, round));
        g2.dispose();
        return new RenderShadow(5, 0.5f, shadowColor).createShadow(img);
    }

    private class TextUI extends BasicPasswordFieldUI {

        //  Override this method to remove background or not paint background
        @Override
        protected void paintBackground(Graphics grphcs) {

        }
    }
}
