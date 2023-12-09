package dashboard.table;

import dashboard.swing.ActionButtons;
import java.awt.*;
import javax.swing.*;

public class Actionified extends DefaultCellEditor{
    
    private ModelAction data;
    
    public Actionified(){
        super(new JCheckBox());
    }
    
    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1){
        data = (ModelAction)o;
        ActionButtons cell = new ActionButtons(data);
        cell.setBackground(new Color(234, 225, 210));
        return cell;
    }
    
    @Override
    public Object getCellEditorValue(){
        return data;
    }
}
