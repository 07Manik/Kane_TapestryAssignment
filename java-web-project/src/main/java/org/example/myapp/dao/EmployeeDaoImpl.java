package org.example.myapp.dao;

import org.example.myapp.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {


private final SessionFactory sessionFactory;

@Autowired
public EmployeeDaoImpl(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
}

@Override
public Employee getEmployeeById(int id) {
    try (Session session = sessionFactory.openSession()) {
        return session.get(Employee.class, id);
    }
}

@Override
public void saveEmployee(Employee employee) {
    save(employee);
}

@Override
public void save(Employee employee) {

    Session session = sessionFactory.getCurrentSession();
    session.save(employee);
}

@Override
public List<Employee> getAll() {
    Session session=sessionFactory.getCurrentSession();
    return session.createQuery("from Employee").list();
}

@Override
public Employee getById(int id) {
    return null;
}
}
