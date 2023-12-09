
package dashboard.table;

import dashboard.model.studentTableModel;

public class ModelAction {

    public studentTableModel getStudent() {
        return student;
    }

    public void setStudent(studentTableModel student) {
        this.student = student;
    }

    
    public EventAction getE() {
        return e;
    }

    public void setE(EventAction e) {
        this.e = e;
    }
    
    public ModelAction(studentTableModel student, EventAction e){
        this.student = student;
        this.e = e;
    }
    
    public ModelAction(){
    }
    
    private studentTableModel student;
    private EventAction e;
}
