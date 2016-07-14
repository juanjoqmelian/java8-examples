package co.uk.dragosolutions.employee;

@FunctionalInterface
public interface EmployeeOperation {

    Employee run(Employee employee);

    static Employee apply(EmployeeOperation operation, Employee employee) {
        operation.run(employee);
        return employee;
    }
}
