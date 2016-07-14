package co.uk.dragosolutions.employee.nonfunctional;


public class ConvertNameToUppercaseOperation implements EmployeeOperation {

    @Override
    public void run(Employee employee) {
        employee.setName(employee.getName().toUpperCase());
    }
}
