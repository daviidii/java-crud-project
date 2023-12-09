package dashboard.table;

import dashboard.model.studentTableModel;

public interface EventAction {
    public void delete(studentTableModel st);
    
    public void update(studentTableModel st);
}
