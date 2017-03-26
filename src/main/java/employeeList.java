/**
 * Created by Tank on 3/23/2017.
 */
public class employeeList {

    private  String employeeName;
    private  String employeeOccupation;

    public employeeList(){}

    public employeeList(String employeeName, String employeeOccupation){
        this.employeeName = employeeName;
        this.employeeOccupation = employeeOccupation;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public void setEmployeeOccupation(String employeeOccupation){
        this.employeeOccupation = employeeOccupation;
    }

    public  String getEmployeeName(){
        return employeeName;
    }

    public String getEmployeeOccupation(){
        return employeeOccupation;
    }

    @Override
    public String toString() {
        return "Student Name: " + employeeName + "\n" + "Course Name: " + employeeOccupation;
    }

}
