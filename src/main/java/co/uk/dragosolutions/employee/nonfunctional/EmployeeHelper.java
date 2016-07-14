package co.uk.dragosolutions.employee.nonfunctional;


import java.math.BigDecimal;

public class EmployeeHelper {

    public static void main(String[] args) {

        Employee employee = new Employee("John Smith", new BigDecimal("35275.86"));

        employee.apply(new AddTravelAllowanceOperation(), new AddBenefitsOperation(), new ConvertNameToUppercaseOperation());

        System.out.println("Final employee is " + employee);
    }
}
