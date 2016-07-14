package co.uk.dragosolutions.employee.nonfunctional;

import java.math.BigDecimal;


public class AddTravelAllowanceOperation implements EmployeeOperation {

    private static final BigDecimal TRAVEL_ALLOWANCE = new BigDecimal("2250.50");

    @Override
    public void run(Employee employee) {
        final BigDecimal newSalary = employee.getTotalSalary().add(TRAVEL_ALLOWANCE);
        employee.setTotalSalary(newSalary);
    }
}
