package org.example.myapp.services;

import org.example.myapp.dao.EmployeeDao;
import org.example.myapp.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

private final EmployeeDao employeeDao;

@Autowired
public EmployeeServiceImpl(EmployeeDao employeeDao) {
    this.employeeDao = employeeDao;
}

@Override
public Employee getEmployeeById(int id) {
    return employeeDao.getById(id);
}

@Override
@Transactional
public void saveEmployee(Employee employee) {
    employeeDao.save(employee);
}

@Override
@Transactional(readOnly = true)
public List<Employee> getAllEmployees() {
    return employeeDao.getAll();
}
}
