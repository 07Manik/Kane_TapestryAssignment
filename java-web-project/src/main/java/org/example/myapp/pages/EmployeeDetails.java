package org.example.myapp.pages;

import org.apache.tapestry5.annotations.InjectPage;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.PageRenderLinkSource;
import org.example.myapp.entities.Employee;
import org.example.myapp.services.EmployeeService;

import java.util.List;

public class EmployeeDetails {
@Inject
private EmployeeService employeeService;

@Inject
private PageRenderLinkSource linkSource;

@Property
private Employee employee;

@Property
private List<Employee> employees;

@InjectPage
private EmployeeDetailPage employeeDetailPage;

@InjectPage
private EmployeeAdd employeeAdd;

public Object onAddEmployee() {
    return employeeAdd;
}

void setupRender(){
    this.employees=employeeService.getAllEmployees();
}

}
