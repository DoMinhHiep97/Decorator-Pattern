/**
 * Created by IntelliJ IDEA
 * User: hiepdm
 * Date: 3/11/2020
 * Time: 12:48 PM
 */
import java.util.Date;

public abstract class EmployeeDecorator implements EmployeeComponent {

    protected EmployeeComponent employee;

    protected EmployeeDecorator(EmployeeComponent employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public void join(Date joinDate) {
        employee.join(joinDate);
    }

    @Override
    public void terminate(Date terminateDate) {
        employee.terminate(terminateDate);
    }
}
