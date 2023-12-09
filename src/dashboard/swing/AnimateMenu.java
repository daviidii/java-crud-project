package dashboard.swing;

import java.awt.*;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.*;

public class AnimateMenu {
    private final MigLayout layout;
    private final MenuItems items;
    private Animator animator;
    private boolean open;
    
    public AnimateMenu(MigLayout layout, Component comp){
        this.layout = layout;
        this.items = (MenuItems)comp;
        initAnimation(comp, 200);
    }
    
    public AnimateMenu(MigLayout layout, Component comp, int duration){
        this.layout = layout;
        this.items = (MenuItems)comp;
        initAnimation(comp, duration);
    }
    
    private void initAnimation(Component comp, int duration){
        int height = comp.getPreferredSize().height;
        TimingTarget target = new TimingTargetAdapter(){
            public void timingEvent(float fraction){
                float n;
                if(open){
                    n = 40 + ((height - 40)*fraction);
                    items.setA(fraction);
                }
                else{
                    n = 40 + ((height - 40 )*(1f - fraction));
                    items.setA(1f - fraction);
                }
                layout.setComponentConstraints(items, "h " + n + "!");
                comp.revalidate();
                comp.repaint();
            }
        };
        animator = new Animator(duration, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);   
    }
    
    public void openMenu(){
        open = true;
        animator.start();
    }
    
    public void closeMenu(){
        open = false;
        animator.start();
    }
    
}
