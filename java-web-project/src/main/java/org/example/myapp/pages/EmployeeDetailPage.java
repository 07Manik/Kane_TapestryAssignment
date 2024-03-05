package org.example.myapp.pages;


import org.apache.tapestry5.annotations.Property;
import org.example.myapp.entities.Employee;


public class EmployeeDetailPage {

    @Property
    private Employee employee;

    void onActivate(Employee employee) {
        this.employee = employee;
    }

    String onPassivate() {
        if (employee != null) {
            return String.valueOf(employee.getId());
        }
        return null;
    }

    public String getPageTitle() {
        return (employee != null) ? "Employee Details - " + employee.getName() : "Employee Details";
    }

}