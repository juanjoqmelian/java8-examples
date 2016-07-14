package co.uk.dragosolutions.employee;

@FunctionalInterface
public interface EmployeeOperation {

    void run(Employee employee);

    static void apply(EmployeeOperation operation, Employee employee) {
        operation.run(employee);
    }
}
