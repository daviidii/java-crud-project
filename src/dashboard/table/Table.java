package dashboard.table;
import dashboard.swing.ActionButtons;
import dashboard.swing.ScrollBarCustom;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.*;

public class Table extends JTable{
    
    public Table(){
        setShowHorizontalLines(true);
        setBackground(new Color(234, 225, 210));
        setGridColor(new Color(37, 52, 57));
        setRowHeight(60);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer (){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean focus, int i, int i1){
                TableHeader header = new TableHeader(o + "");
                if(i1 == 6){
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean focus, int i, int i1){
                if (o instanceof ModelAction){
                    ModelAction data = (ModelAction)o;
                    ActionButtons cell = new ActionButtons(data);
                    if(selected){
                        cell.setBackground(new Color(244, 243, 238));
                    }else{
                        cell.setBackground(new Color(234, 225, 210));
                    }
                    return cell;
                }else{
                    Component comp = super.getTableCellRendererComponent(jtable, o, selected, focus, i, i1);
                    setBorder(noFocusBorder);
                    comp.setForeground(new Color(37, 52, 57));
                    if(selected){
                        comp.setBackground(new Color(244, 243, 238));
                    }else{
                        comp.setBackground(new Color(234, 225, 210));
                    }
                    return comp;
                }
            }
        });
    }
    
    @Override
    public TableCellEditor getCellEditor(int row, int colm){
        if(colm == 6){
            return new Actionified();
        }else{
            return super.getCellEditor(row,colm);
        }
    }
    
    public void addData(Object[]row){
        DefaultTableModel tm = (DefaultTableModel)getModel();  
        tm.addRow(row);
    }
    
    public void setTableScroll(JScrollPane sp){
        sp.getViewport().setBackground(new Color(234,225,210));
        sp.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        p.setBackground(new Color(234,225,210));
        sp.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        sp.setBorder(new EmptyBorder(5,10,5,10));
    }
    
    public void clearData(){
        DefaultTableModel tm = (DefaultTableModel)getModel();
        tm.setRowCount(0);
    }
}
