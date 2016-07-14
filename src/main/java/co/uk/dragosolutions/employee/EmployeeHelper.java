package co.uk.dragosolutions.employee;


import java.math.BigDecimal;

public class EmployeeHelper {

    private static final BigDecimal TRAVEL_ALLOWANCE = new BigDecimal("2250.50");
    private static final BigDecimal BENEFITS = new BigDecimal("1765.90");


    public static void main(String[] args) {

        EmployeeOperation addTravelAllowance = (Employee employee) -> {
            final BigDecimal newSalary = employee.getTotalSalary().add(TRAVEL_ALLOWANCE);
            employee.setTotalSalary(newSalary);
        };
        EmployeeOperation addBenefits = (Employee employee) -> {
            final BigDecimal salaryWithBenefits = employee.getTotalSalary().add(BENEFITS);
            employee.setTotalSalary(salaryWithBenefits);
        };
        EmployeeOperation convertNameToUppercase = (Employee employee) -> {
            employee.setName(employee.getName().toUpperCase());
        };

        Employee employee = new Employee("John Smith", new BigDecimal("35275.86"));

        employee.apply(addTravelAllowance, addBenefits, convertNameToUppercase);

        System.out.println("Final employee is " + employee);
    }
}
