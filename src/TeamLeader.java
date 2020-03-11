/**
 * Created by IntelliJ IDEA
 * User: hiepdm
 * Date: 3/11/2020
 * Time: 12:49 PM
 */
public class TeamLeader extends EmployeeDecorator {

    protected TeamLeader(EmployeeComponent employee) {
        super(employee);
    }

    public void planing() {
        System.out.println(this.employee.getName() + " is planing.");
    }

    public void motivate() {
        System.out.println(this.employee.getName() + " is motivating his members.");
    }

    public void monitor() {
        System.out.println(this.employee.getName() + " is monitoring his members.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        planing();
        motivate();
        monitor();
    }
}