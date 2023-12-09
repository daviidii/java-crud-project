package dashboard.model;

import dashboard.table.EventAction;
import dashboard.table.ModelAction;

public class studentTableModel {

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public studentTableModel(int studentId, String name, String course, String section, String gender, float gpa){
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.section = section;
        this.gender = gender;
        this.gpa = gpa;
    }
    
    public studentTableModel(){
        
    }
    
    private int studentId;
    private String name;
    private String course;
    private String section;
    private String gender;
    private float gpa;
    
    public Object[]toRowTable(EventAction event){
        return new Object[]{studentId, name, course, section, gender, gpa, new ModelAction(this, event)};
    }
}
