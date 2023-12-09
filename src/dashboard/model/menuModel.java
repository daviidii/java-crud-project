package dashboard.model;

import java.awt.Color;
import javax.swing.Icon;

public class menuModel {

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(String mainMenu) {
        this.mainMenu = mainMenu;
    }

    public String[] getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(String[] subMenu) {
        this.subMenu = subMenu;
    }

    
    public menuModel(Icon icon, String mainMenu, String... subMenu){
        this.icon = icon;
        this.mainMenu = mainMenu;
        this.subMenu = subMenu;
    }
    
    public menuModel(){
        
    }
    private Icon icon;
    private String mainMenu;
    private String subMenu[];
    
}
