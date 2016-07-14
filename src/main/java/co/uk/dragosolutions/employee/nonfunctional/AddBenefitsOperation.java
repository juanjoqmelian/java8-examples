package co.uk.dragosolutions.employee.nonfunctional;

import java.math.BigDecimal;


public class AddBenefitsOperation implements EmployeeOperation {

    private static final BigDecimal BENEFITS = new BigDecimal("1765.90");


    @Override
    public void run(Employee employee) {
        final BigDecimal salaryWithBenefits = employee.getTotalSalary().add(BENEFITS);
        employee.setTotalSalary(salaryWithBenefits);
    }
}
