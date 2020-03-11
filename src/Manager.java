/**
 * Created by IntelliJ IDEA
 * User: hiepdm
 * Date: 3/11/2020
 * Time: 12:49 PM
 */
public class Manager extends EmployeeDecorator {

    protected Manager(EmployeeComponent employee) {
        super(employee);
    }

    public void createRequirement() {
        System.out.println(this.employee.getName() + " is create requirements.");
    }

    public void assignTask() {
        System.out.println(this.employee.getName() + " is assigning tasks.");
    }

    public void manageProgress() {
        System.out.println(this.employee.getName() + " is managing the progress.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        createRequirement();
        assignTask();
        manageProgress();
    }
}