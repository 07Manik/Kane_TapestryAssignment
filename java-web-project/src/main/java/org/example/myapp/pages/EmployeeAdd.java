package org.example.myapp.pages;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.example.myapp.entities.Employee;
import org.example.myapp.services.EmployeeService;

public class EmployeeAdd {

@Inject
private EmployeeService employeeService;


@Property
private String name;

@Property
private int age;

@Property
private String address;

@InjectPage
private EmployeeDetails employeeDetails;

@Component
private Form employeeForm;


//    void onValidateFromEmployeeForm() {
//
//    }
//private boolean isValidEmployeeData() {
//
//return true;
//}

Object onSuccessFromEmployeeForm() {
    employeeService.saveEmployee(new Employee(age, name, address));
return employeeDetails;

}

}