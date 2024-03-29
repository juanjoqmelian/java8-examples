package co.uk.dragosolutions.employee;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.function.Predicate;


public class Employee {

    private String name;
    private BigDecimal baseSalary;
    private BigDecimal totalSalary;


    public Employee(String name, BigDecimal baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.totalSalary = baseSalary;
    }

    public void apply(EmployeeOperation ...operations) {
        Arrays.asList(operations).stream()
                .forEach(operation -> EmployeeOperation.apply(operation, this));
    }

    public boolean is(Predicate<Employee>...predicates) {
        return Arrays.asList(predicates).stream()
                .allMatch(predicate -> predicate.test(this));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(BigDecimal baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BigDecimal getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(BigDecimal totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                ", totalSalary=" + totalSalary +
                '}';
    }
}
